package game;

import java.util.ArrayList;

import game.arenas.*;
import game.racers.*;

public class GameEngine {
	private AerialArena airArena;
	private LandArena landArena;
	private NavalArena navalArena;
	private ArenaType activeAerna;
	private static GameEngine instance;

	//TODO constructeur de la classe GameEngine

	public static synchronized GameEngine getInstance()
	{
		if(instance==null)
		{
			instance = new GameEngine();
		}
		return instance;
	}

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
	public void startRace() {

		switch (this.activeAerna) {
		case AERIALARENA:{
			while(airArena.hasActiveRacers())
				airArena.playTurn();
			ArrayList<Object> finished=airArena.getFinished();
			for (int i = 0; i < finished.size(); i++) {
				System.out.println("#"+(i+1) +" "+finished.get(i));
			}
			break;
			
		}
		case NEVALARENA:{
			while(navalArena.hasActiveRacers())
				navalArena.playTurn();
			ArrayList<Object> finished=navalArena.getFinished();
			for (int i = 0; i < finished.size(); i++) {
				System.out.println("#"+(i+1) +" "+finished.get(i));
			}
			break;
		}
		case LANDARENA:{
			while(landArena.hasActiveRacers())
				landArena.playTurn();
			ArrayList<Object> finished=landArena.getFinished();
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


