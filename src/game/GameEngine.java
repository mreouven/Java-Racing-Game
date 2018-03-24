package game;

import game.arenas.AerialArena;
import game.arenas.ArenaType;
import game.arenas.LandArena;
import game.arenas.NavalArena;

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
			return true;
		}
		else if(arena instanceof LandArena) {
			landArena=(LandArena) arena;
			activeAerna=ArenaType.LANDARENA;
			return true;
		}
		else if(arena instanceof NavalArena) {
			navalArena=(NavalArena) arena;
			activeAerna=ArenaType.NEVALARENA;
			return true;
		}
		else {
			return false;
		}
	}


}
