package game.racers;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import game.arenas.NavalArena;
import utilities.Point;

public class RowBoat {
	String name;
	Point currentLocation;
	Point finish;
	NavalArena arena;
	double maxSpeed;
	double acceleration;
	double currentSpeed;

	public Point move(double friction) {
		return currentLocation;
	}

	public void initRace(NavalArena arena, Point start, Point finish) {
		if(arena!=null) {
			this.arena=arena;
		}
		if(finish!=null) {
			this.finish=finish;
		}
		if(start != null) {
			this.currentLocation=start;
		}
	}




	public RowBoat(String name, double maxSpeed, double acceleration) {
		//TODO verifier l'acceleration max
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
	}

	public RowBoat(String name) {
		this(name, 75, 10);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	public double getAcceleration() {
		return acceleration;
	}


	public void setAcceleration(double acceleration) {
		this.acceleration = acceleration;
	}
}
