package game.racers;

import game.arenas.AerialArena;
import utilities.Point;

public class Helicopter {
	String name;
	Point currentLocation;
	Point finish;
	AerialArena arena;
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

	public void initRace(AerialArena arena, Point start, Point finish) {
		this.arena=arena;
		this.finish=finish;
		//deplace le joueur au point de departs
		this.currentLocation.setX(start.getX());
		
	}



	public Helicopter(String name, double maxSpeed, double acceleration) {
		super();
		this.name = name;
		this.name = name;
		if(maxSpeed>150) {
			maxSpeed=150;
		}
		this.maxSpeed = maxSpeed;
		if(acceleration>10) {
			acceleration=10;
		}
		this.acceleration = acceleration;
	}

	public Helicopter(String name) {
		this(name, 150, 10);
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
