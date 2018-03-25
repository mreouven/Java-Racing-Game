package game.arenas;

import java.util.ArrayList;
import game.racers.Car;
import game.racers.Horse;
import utilities.Point;

/**
 * <b>LandArena cest la classe qui repressente les arennes du parterre.</b>
 * <p>
 * Elle est caracteriser par les fonction suivante :
 * <ul>
 * <li>Start and Final point.</li>
 * <li>List of car and horse.</li>
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
 * @see NavalArena
 * @see AerialArena
 * 
 * @author Reouven Mimoun
 * @author Emeth Genah
 * @version 1.0
 */
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

	public ArrayList<Object> getFinished() {
		return finished;
	}

	public boolean addHorse(Horse newRacer) {
		if((horses.size()+ cars.size())<MAX_RACERS){
			if(newRacer != null) {
				horses.add(newRacer);
				return true;
			}
		}
		return false;
	}
	
	public boolean addCar(Car newRacer) {
		if((horses.size()+ cars.size())<MAX_RACERS){
			if(newRacer != null) {
				cars.add(newRacer);
				return true;
			}
		}
		return false;
	}
	
	public int crossFinishLine(Horse racer) {
		finished.add(racer);
		return (finished.indexOf(racer) + 1);
	}
	
	public int crossFinishLine(Car racer) {
		finished.add(racer);
		return (finished.indexOf(racer) + 1);
	}
	
	public void initRace() {
		for (int i = 0; i < horses.size(); i++)
			horses.get(i).initRace(this, start, finish);
		for (int i = 0; i < cars.size(); i++)
			cars.get(i).initRace(this, start, finish);
	}

	public void playTurn() {
		if(this.hasActiveRacers()) {
			Point temp=null;
			for (int i = 0; i < this.cars.size(); i++) {
				temp=cars.get(i).move(FRICTION);	
				if(temp.getX()>=finish.getX()) {
					finished.add(cars.get(i));
					cars.remove(i);
				}
			}
			for (int i = 0; i < this.horses.size(); i++) {
				temp=horses.get(i).move(FRICTION);	
				if(temp.getX()>=finish.getX()) {
					finished.add(horses.get(i));
					horses.remove(i);
				}
			}
		}
	}

	public boolean hasActiveRacers() {
		if(horses.size()!=0||cars.size()!=0)
			return true;
		return false;

	}
}
