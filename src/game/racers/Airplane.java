package game.racers;
import game.arenas.AerialArena;
import utilities.Point;

public class Airplane {
	/**
	 * The name is String Type and can't be modified.
	 * 
	 * @see Airplane#Airplane(String, double, double)
	 * @see Airplane#Airplane(String)
	 * @see Airplane#toString()
	 * @see Airplane#getName()
	 * @see Airplane#setName(String)
	 */
	String name;
	
	/**
	 * The current Location of the airplane in the game.
	 * 
	 * @see Airplane#move(double)
	 * @see Airplane#initRace(AerialArena, Point, Point)
	 * @see Airplane#Airplane(String)
	 * @see Airplane#Airplane(String, double, double)
	 */
	Point currentLocation;
	
	/**
	 * The finish of type Point is the end line of the game.
	 * 
	 * @see Airplane#initRace(AerialArena, Point, Point)
	 */
	Point finish;
	AerialArena arena;
	double maxSpeed;
	double acceleration;
	double currentSpeed;
	
	/**
	 * 
	 * @param friction
	 * @return currenLocation
	 * 	return the current location.
	 * @see Point#getX()
	 */
	public Point move(double friction) {
		if(maxSpeed<currentSpeed+acceleration*friction)
			currentSpeed+=acceleration*friction;
		else {
			currentSpeed=maxSpeed;
		}
		currentLocation.setX(currentLocation.getX()+currentSpeed);
		return currentLocation;

	}
	
	/**
	 * 
	 * @param arena
	 * 	Sent the instance of the arena we will play in this game.
	 * @param start
	 * 	Sent the start Point of the game.
	 * @param finish
	 * 	Sent the finish Point which is the end line of the game.
	 */
	public void initRace(AerialArena arena, Point start, Point finish) {
		this.arena=arena;
		this.finish=finish;
		//deplace le joueur au point de departs
		this.currentLocation.setX(start.getX());
		
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
		currentLocation=new Point(0,0);
	}

	public Airplane(String name) {
		this(name, 220, 20);
	}

	@Override
	public String toString() {
		return "Airplane " + name +" (" + maxSpeed + ", " + acceleration + ")";
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
