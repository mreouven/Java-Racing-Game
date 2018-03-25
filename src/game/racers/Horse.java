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

		return currentLocation;

	}
	public void initRace(LandArena arena, Point start, Point finish) {

	}





	public Horse(String name, double maxSpeed, double acceleration) {
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
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
