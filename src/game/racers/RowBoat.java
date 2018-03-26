package game.racers;

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
		if(maxSpeed>currentSpeed+acceleration*friction)
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




	public RowBoat(String name, double maxSpeed, double acceleration) {
		//TODO verifier l'acceleration max
		super();
		this.name = name;
		if(maxSpeed>75) {
			maxSpeed=75;
		}
		this.maxSpeed = maxSpeed;
		if(acceleration>10) {
			acceleration=10;
		}
		this.acceleration = acceleration;
		currentLocation=new Point(0,0);
	}

	public RowBoat(String name) {
		this(name, 75, 10);
	}
	
	@Override
	public String toString() {
		return "RowBoat " + name +" (" + maxSpeed + ", " + acceleration + ")";
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
