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
		if((airplanes.size()+ helicopters.size())<MAX_RACERS){
			if(newRacer != null) {
				airplanes.add(newRacer);
				return true;
			}
		}
		return false;
	}
	
	public boolean addHelicopter(Helicopter newRacer) {
		if((airplanes.size()+ helicopters.size())<MAX_RACERS){
			if(newRacer != null) {
				helicopters.add(newRacer);
				return true;
			}
		}
		return false;
	}
	
	public int crossFinishLine(Airplane racer) {
		finished.add(racer);
		return (finished.indexOf(racer) + 1);
	}
	
	public int crossFinishLine(Helicopter racer) {
		finished.add(racer);
		return (finished.indexOf(racer) + 1);
	}
	
	public void initRace() {
		for (int i = 0; i < helicopters.size(); i++)
			helicopters.get(i).initRace(this, start, finish);
		for (int i = 0; i < airplanes.size(); i++)
			airplanes.get(i).initRace(this, start, finish);
	}

	

	public void playTurn() {
		if(hasActiveRacers()) {
			Point temp=null;
			for (int i = 0; i < this.airplanes.size(); i++) {
				temp=airplanes.get(i).move(FRICTION);	
				if(temp.getX()>=finish.getX()) {
					crossFinishLine(airplanes.get(i));
					airplanes.remove(i);
				}
			}
			for (int i = 0; i < this.helicopters.size(); i++) {
				temp=helicopters.get(i).move(FRICTION);	
				if(temp.getX()>=finish.getX()) {
					crossFinishLine(helicopters.get(i));
					helicopters.remove(i);
				}
			}
		}
	}

	public boolean hasActiveRacers() {
		if(helicopters.size()!=0||airplanes.size()!=0)
			return true;
		return false;

	}
	
}
