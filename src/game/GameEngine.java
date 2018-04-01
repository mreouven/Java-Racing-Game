package game;

import java.util.ArrayList;
import game.arenas.*;
import game.racers.*;

/**
 * This is the class GameEngine
 * <p>The class is a singleton and only getInstance() can create the instance
 * <p>This class is build by many information :</p>
 * <ul>
 * <li>AerialArena object</li>
 * <li>LandArena object</li>
 * <li>NavalArena object</li>
 * <li>ArenaType that contains an enum of all arena</li>
 * <li>The instance of GameEngine</li>
 * </ul>
 * 
 * @author Emeth Genah
 * @author Reouven Mimoun
 * 
 * 
 */
public class GameEngine {
	
	private AerialArena airArena;
	private LandArena landArena;
	private NavalArena navalArena;
	private ArenaType activeAerna;
	private static GameEngine instance;

	//TODO constructeur de la classe GameEngine
	
	/**
	 * This method create the instance of GameEngine
	 * 
	 * @return instance
	 */
	public static synchronized GameEngine getInstance()
	{
		if(instance==null)
		{
			instance = new GameEngine();
		}
		return instance;
	}

	/**
	 * Method that set the right Arena for the instance and return a boolean
	 * <ul>
	 * <li>false if arena is null or there is no active arena</li>
	 * <li>true if set the right arena for the instance</li>
	 * 
	 * @param arena
	 * @return boolean
	 */
	public boolean setArena(Object arena) {
		//TODO verifier que les autres doit etres null
		if (arena==null) {
			return false;
		}
		else if(arena instanceof AerialArena) {
			airArena=(AerialArena) arena;
			activeAerna=ArenaType.AERIALARENA;
			navalArena=null;
			landArena=null;
			return true;
		}
		else if(arena instanceof LandArena) {
			landArena=(LandArena) arena;
			activeAerna=ArenaType.LANDARENA;
			navalArena=null;
			airArena=null;
			return true;
		}
		else if(arena instanceof NavalArena) {
			navalArena=(NavalArena) arena;
			activeAerna=ArenaType.NEVALARENA;
			airArena=null;
			landArena=null;
			return true;
		}
		else {
			activeAerna=null;
			return false;
		}
	}

	/**
	 * The method addRacer add an racer by parameter of type object.
	 * <ul>
	 * <li>if the parameter or activateArena is null</li>
	 * <li>we pass by switch to add the racer on the proper arena</li>
	 * 
	 * @param newRacer
	 * 	Type Object
	 * @return boolean
	 */
	public boolean addRacer(Object newRacer) {

		if(newRacer==null || this.activeAerna==null) {
			return false;
		}

		switch (this.activeAerna) {
		case AERIALARENA:{
			if(newRacer instanceof Airplane) {
				if(airArena.addAirplane((Airplane)newRacer))
					return true;
			}
			if(newRacer instanceof Helicopter) {
				if(airArena.addHelicopter((Helicopter) newRacer))
					return true;
			}

			break;
		}
		case NEVALARENA:{
			if(newRacer instanceof RowBoat) {
				if(navalArena.addRowBoat((RowBoat) newRacer))
					return true;
			}
			if(newRacer instanceof SpeedBoat) {
				if(navalArena.addSpeedBoat((SpeedBoat) newRacer))
					return true;
			}
			break;
		}
		case LANDARENA:{
			if (newRacer instanceof Horse) {
				if(landArena.addHorse((Horse) newRacer))
					return true;
			}
			if (newRacer instanceof Car) {
				if(landArena.addCar((Car) newRacer))
					return true;
			}
		}
		default:
			return false;
		}
		return false;
	}

	/**
	 * The method initRace call initRace for the proper arena
	 * <p>initialize by switch case</p>
	 */
	public void initRace() {
		switch (this.activeAerna) {
		case AERIALARENA:{
			airArena.initRace();
			break;
		}
		case NEVALARENA:{
			navalArena.initRace();
			break;
		}
		case LANDARENA:{
			landArena.initRace();
			break;
		}
		default:
			System.out.println("error active type");
			break;
		}
	}
	
	/**
	 * The method startRace start the game and print the racers who finish the race in order
	 * <p>This call switch case by sending the activateArena of the instance</p>
	 * <p>By case in a loop, playTurn is call until hasActivateRacer is return true</p>
	 * <p>then print the finisher</p>
	 * 
	 */
	public void startRace() {
		switch (this.activeAerna) {
		case AERIALARENA:{
			while(airArena.hasActiveRacers())
				airArena.playTurn();
			ArrayList<Object> finished=airArena.getFinished();
			System.out.println("Aerial Race ended!");
			for (int i = 0; i < finished.size(); i++) {
				System.out.println("#"+(i+1) +" "+finished.get(i));
			}
			break;
			
		}
		case NEVALARENA:{
			while(navalArena.hasActiveRacers())
				navalArena.playTurn();
			ArrayList<Object> finished=navalArena.getFinished();
			System.out.println("Naval Race ended!");
			for (int i = 0; i < finished.size(); i++) {
				System.out.println("#"+(i+1) +" "+finished.get(i));
			}
			break;
		}
		case LANDARENA:{
			while(landArena.hasActiveRacers())
				landArena.playTurn();
			ArrayList<Object> finished=landArena.getFinished();
			System.out.println("Land Race ended!");
			for (int i = 0; i < finished.size(); i++) {
				System.out.println("#"+(i+1) +" "+finished.get(i));
			}
			break;
		}
		default:
			System.out.println("error active type");
			break;
		}
	}
}


