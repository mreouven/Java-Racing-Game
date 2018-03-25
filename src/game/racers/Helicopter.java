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

		return currentLocation;

	}

	public void initRace(AerialArena arena, Point start, Point finish) {

	}



	public Helicopter(String name, double maxSpeed, double acceleration) {
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
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
