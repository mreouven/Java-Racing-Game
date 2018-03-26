package utilities;

import game.GameEngine;
import game.arenas.*;
import game.racers.*;

public class Program {

	public static void main(String[] args) {
		Point start = new Point(0, 0);
		Point finish = new Point(1500, 0);
		GameEngine game = GameEngine.getInstance();
		AerialArena air = new AerialArena(start, finish);
		game.setArena(air);
		game.addRacer(new Airplane("Bob", 220, 10));
		game.addRacer(new Airplane("John", 175, 20));
		game.addRacer(new Airplane("Frank", 180, 15));
		game.addRacer(new Airplane("Matt", 230, 8));
		game.initRace();
		game.startRace();
		System.out.println("---- 2 ----");
		air = new AerialArena(start, new Point(20000, 0));
		game.setArena(air);
		game.addRacer(new Airplane("Bob", 220, 10));
		game.addRacer(new Airplane("John", 175, 20));
		game.addRacer(new Airplane("Frank", 180, 15));
		game.addRacer(new Airplane("Matt", 230, 8));
		game.initRace();
		game.startRace();
		System.out.println("---- 3 ----");
		air = new AerialArena(start, new Point(5000000, 0));
		game.setArena(air);
		game.addRacer(new Airplane("Bob ", 120, 10));
		game.addRacer(new Airplane("John", 220, 10));
		game.addRacer(new Airplane("Frank", 250, 8));
		game.addRacer(new Airplane("Matt", 230, 8));
		game.initRace();
		game.startRace();
	}


}
