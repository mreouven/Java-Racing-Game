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
	/**
	 * This is the constructor of the AerialArena
	 * <p>initiate all the arrayList</p>
	 * 
	 * @param start
	 * 	the start point of the race
	 * @param finish
	 * 	the finish point of the race
	 */
	public AerialArena(Point start, Point finish) {
		super();
		this.start = new Point(start.getX(), start.getY());
		this.finish = new Point(finish.getX(), finish.getY());
		airplanes=new ArrayList<>();
		helicopters=new ArrayList<>();
		finished=new ArrayList<>();
	}

	/**
	 * The method add an Airplane and check that the number of racer is inferior of MAX_RACERS
	 * <ul>
	 * <li>return true if add a racer</li>
	 * <li>return false if not</li>
	 * </ul>
	 * 
	 * @param newRacer
	 * @return boolean
	 */
	public boolean addAirplane(Airplane newRacer) {
		if((airplanes.size()+ helicopters.size())<MAX_RACERS){
			if(newRacer != null) {
				airplanes.add(newRacer);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @return finished
	 * 
	 */
	public ArrayList<Object> getFinished() {
		return finished;
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
		return (finished.size());
	}
	
	public int crossFinishLine(Helicopter racer) {
		finished.add(racer);
		return (finished.size());
	}
	
	public void initRace() {
		for (int i = 0; i < helicopters.size(); i++) {
			helicopters.get(i).initRace(this, start, finish);}
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

	public Point getFinish() {
		
		return finish;
	}
	
}
