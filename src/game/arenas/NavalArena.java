package game.arenas;

import java.util.ArrayList;
import game.racers.RowBoat;
import game.racers.SpeedBoat;
import utilities.Point;

/**
 * <b>LandArena cest la classe qui repressente les arennes du parterre.</b>
 * <p>
 * Elle est caracteriser par les fonction suivante :
 * <ul>
 * <li>Start and Final point.</li>
 * <li>List of RowBoat and SpeedBoat.</li>
 * <li>List of finished participant.</li>
 * </ul>
 * </p>
 * <p>
 * Constant description of class:
 * <ul>
 * <li>Friction force.</li>
 * <li>The maximum of participant accept.</li>
 * </ul>
 * 
 * </p>
 * 
 * @see LandArena
 * @see AerialArena
 * 
 * @author Reouven Mimoun
 * @author Emeth Genah
 * @version 1.0
 */

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
		if((rowBoats.size()+ speedBoats.size())<MAX_RACERS){
			if(newRacer != null) {
				speedBoats.add(newRacer);
				return true;
			}
		}
		return false;
	}

	public boolean addRowBoat(RowBoat newRacer) {
		if((rowBoats.size()+ speedBoats.size())<MAX_RACERS){
			if(newRacer != null) {
				rowBoats.add(newRacer);
				return true;
			}
		}
		return false;
	}
	
	public int crossFinishLine(RowBoat racer) {
		finished.add(racer);
		return (finished.indexOf(racer) + 1);
	}
	
	public int crossFinishLine(SpeedBoat racer) {
		finished.add(racer);
		return (finished.indexOf(racer) + 1);
	}
	
	public void initRace() {
		for (int i = 0; i < rowBoats.size(); i++)
			rowBoats.get(i).initRace(this, start, finish);
		for (int i = 0; i < speedBoats.size(); i++)
			speedBoats.get(i).initRace(this, start, finish);
	}

	public void playTurn() {
		if(this.hasActiveRacers()) {
			Point temp=null;
			for (int i = 0; i < this.rowBoats.size(); i++) {
				temp=rowBoats.get(i).move(FRICTION);	
				if(temp.getX()>=finish.getX()) {
					finished.add(rowBoats.get(i));
					rowBoats.remove(i);
				}
			}
			for (int i = 0; i < this.speedBoats.size(); i++) {
				temp=speedBoats.get(i).move(FRICTION);	
				if(temp.getX()>=finish.getX()) {
					finished.add(speedBoats.get(i));
					speedBoats.remove(i);
				}
			}
		}
	}

	public boolean hasActiveRacers() {
		if(rowBoats.size()!=0||speedBoats.size()!=0)
			return true;
		return false;

	}

	public ArrayList<Object> getFinished() {
		return finished;
	}

}
