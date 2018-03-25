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
	
	public LandArena(Point start, Point finish) {
		super();
		this.start = start;
		this.finish = finish;
	}

	public boolean addHorse(Horse newRacer) {
		if(newRacer != null) {
			horses.add(newRacer);
			return true;}
		return false;
	}

	public boolean addCar(Car newRacer) {
		if(newRacer != null) {
			cars.add(newRacer);
			return true;}
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
