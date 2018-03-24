package game.arenas;

import java.util.ArrayList;

import javax.xml.ws.Holder;

import game.racers.Car;
import game.racers.Horse;
import utilities.Point;

public class LandArena {
	
	
	private Point start;
	private Point finish;
	
	private ArrayList<Horse>horses;
	private ArrayList<Car>cars;
	private ArrayList<Object> finished;
	
	private final static double FRICTION = 0.5;
	private final static int MAX_RACERS = 8;
	
	LandArena(Point start,Point Finish){
		
	}
	
	
	public boolean addHorse(Horse newRacer) {
		
		return true;
	}

	public boolean addCar(Car newRacer) {
		
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
