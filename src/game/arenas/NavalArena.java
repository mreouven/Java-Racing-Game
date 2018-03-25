package game.arenas;

import java.util.ArrayList;

import game.racers.RowBoat;
import game.racers.SpeedBoat;
import utilities.Point;

public class NavalArena {


	private Point start;
	private Point finish;

	private ArrayList<RowBoat>rowBoats;
	private ArrayList<SpeedBoat>speedBoats;
	private ArrayList<Object> finished;

	private final static double FRICTION = 0.7;
	private final static int MAX_RACERS = 5;



	public NavalArena(Point start, Point finish) {
		super();
		this.start = start;
		this.finish = finish;
	}

	public boolean addSpeedBoat(SpeedBoat newRacer) {
		if(newRacer != null) {
			speedBoats.add(newRacer);
			return true;}
		return false;
	}

	public boolean addRowBoat(RowBoat newRacer) {
		if(newRacer != null) {
			rowBoats.add(newRacer);
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
