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
	//TODO verifier si MAX_RACERS final??
	private final static int MAX_RACERS = 6;
	
	//Constructor
	public AerialArena(Point start, Point finish) {
		super();
		this.start = start;
		this.finish = finish;
	}

	public boolean addAirplane(Airplane newRacer) {
		if(newRacer != null) {
			airplanes.add(newRacer);
			return true;
			}
		return false;
	}

	public boolean addHelicopter(Helicopter newRacer) {
		if(newRacer != null) {
			helicopters.add(newRacer);
			return true;
			}
		return false;
	}
	public void initRace() {
		
	}
	
	public void playTurn() {
		
	}
	
	public boolean hasActiveRacers() {
		
		return false;
		
	}
	
}
