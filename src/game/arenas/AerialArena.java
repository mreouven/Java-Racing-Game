package game.arenas;

import java.util.ArrayList;

import game.racers.Airplane;
import game.racers.Helicopter;
import utilities.Point;

public class AerialArena {
	
	
	
	private Point start;
	private Point finish;
	
	private ArrayList<Airplane> airplanes;
	private ArrayList<Helicopter> helicopters;
	private ArrayList<Object> finished;
	
	private final static double FRICTION = 0.4;
	private final static int MAX_RACERS = 6;
	
	AerialArena(Point start,Point Finish){
		
	}
	
	
	public boolean addAirplane(Airplane newRacer) {
		
		return true;
	}

	public boolean addHelicopter(Helicopter newRacer) {
		
		return true;
	}
	public void initRace() {
		
	}
	
	public void playTurn() {
		
	}
	
	public boolean hasActiveRacers() {
		
		return false;
		
	}
	
}
