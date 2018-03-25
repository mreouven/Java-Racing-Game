package game.racers;

import game.arenas.LandArena;
import utilities.Point;

public class Horse {
	String name;
	Point currentLocation;
	Point finish;
	LandArena arena;
	double maxSpeed;
	double acceleration;
	double currentSpeed;

	public Point move(double friction) {
		if(maxSpeed<currentSpeed+acceleration*friction)
			currentSpeed+=acceleration*friction;
		else {
			currentSpeed=maxSpeed;
		}
		currentLocation.setX(currentLocation.getX()+currentSpeed);
		return currentLocation;
	}
	public void initRace(LandArena arena, Point start, Point finish) {
		this.arena=arena;
		this.finish=finish;
		//deplace le joueur au point de departs
		this.currentLocation.setX(start.getX());
		
	}





	public Horse(String name, double maxSpeed, double acceleration) {
		super();
		this.name = name;
		this.name = name;
		if(maxSpeed>80) {
			maxSpeed=80;
		}
		this.maxSpeed = maxSpeed;
		if(acceleration>7) {
			acceleration=7;
		}
		this.acceleration = acceleration;
	}

	public Horse(String name) {
		this(name, 80, 7);
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
