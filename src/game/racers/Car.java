package game.racers;

import game.arenas.LandArena;
import utilities.Point;

public class Car {
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
	

	public Car(String name, double maxSpeed, double acceleration) {
		super();
		this.name = name;
		if(maxSpeed>120) {
			maxSpeed=120;
		}
		this.maxSpeed = maxSpeed;
		if(acceleration>12) {
			acceleration=12;
		}
		this.acceleration = acceleration;
		currentLocation=new Point(0,0);
	}

	public Car(String name) {
		this(name, 120, 12);
	}

	@Override
	public String toString() {
		return "Car " + name +" (" + maxSpeed + ", " + acceleration + ")";
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
