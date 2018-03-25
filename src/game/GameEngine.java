package game;

import game.arenas.*;
import game.racers.Airplane;
import game.racers.Car;
import game.racers.Helicopter;
import game.racers.Horse;
import game.racers.RowBoat;
import game.racers.SpeedBoat;

public class GameEngine {
	private AerialArena airArena;
	private LandArena landArena;
	private NavalArena navalArena;
	private ArenaType activeAerna;
	private static GameEngine instance;


	public static synchronized GameEngine getInstance()
	{
		if(instance==null)
		{
			instance = new GameEngine();
		}
		return instance;
	}

	public boolean setArena(Object arena) {
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
	
	

}
