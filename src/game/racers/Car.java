package game.racers;

import utilities.Point;

public class Car {
	String name;
	Point currentLocation;
	Point finish;
	double maxSpeed;
	double acceleration;
	double currentSpeed;
	
	public Point move(double friction) {
				
		return currentLocation;
		
	}
	
	

	public Car(String name, double maxSpeed, double acceleration) {
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
	}

	public Car(String name) {
		super();
		this.name = name;
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
