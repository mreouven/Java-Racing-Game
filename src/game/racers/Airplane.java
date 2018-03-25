package game.racers;
import game.arenas.AerialArena;
import game.arenas.LandArena;
import utilities.Point;

public class Airplane {
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
			this.finish=finish;
	}


	
	//TODO verifier valeur correct
	public Airplane(String name, double maxSpeed, double acceleration) {
		super();
		this.name = name;
		if(maxSpeed>220) {
			maxSpeed=220;
		}
		this.maxSpeed = maxSpeed;
		if(acceleration>20) {
			acceleration=20;
		}
		this.acceleration = acceleration;
	}

	public Airplane(String name) {
		this(name, 220, 20);
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
