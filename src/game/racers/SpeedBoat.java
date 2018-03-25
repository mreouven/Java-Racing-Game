package game.racers;

import game.arenas.NavalArena;
import utilities.Point;

public class SpeedBoat {
	String name;
	Point currentLocation;
	Point finish;
	NavalArena arena;
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

	public void initRace(NavalArena arena, Point start, Point finish) {
		this.arena=arena;
		this.finish=finish;
		//deplace le joueur au point de departs
		this.currentLocation.setX(start.getX());
		

	}



	public SpeedBoat(String name, double maxSpeed, double acceleration) {
		super();
		this.name = name;
		this.name = name;
		if(maxSpeed>170) {
			maxSpeed=170;
		}
		this.maxSpeed = maxSpeed;
		if(acceleration>5) {
			acceleration=5;
		}
		this.acceleration = acceleration;
	}

	public SpeedBoat(String name) {
		this(name, 170, 5);
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
