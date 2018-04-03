package utilities;

import game.racers.SpeedBoat;

/**
 * This is the class Point
 * <p>This class is build by many information :</p>
 * <ul>
 * <li>The coordinate x</li>
 * <li>The coordinate y</li>
 * </ul>
 * 
 * @author Emeth Genah
 * @author Reouven Mimoun
 * 
 * 
 */
public class Point {
	private static final int MAX_X=10000000;
	private static final int MAX_Y=800;
	private static final int MIN_X=0;
	private static final int MIN_Y=0;
	/**
	 * The coordinate x in the class Point.
	 * 
	 * @see Point#getX()
	 * @see Point#setX(double)
	 * 
	 */
	private double x;
	
	/**
	 * The coordinate y in the class Point.
	 * 
	 * @see Point#getY()
	 * @see Point#setY(double)
	 * 
	 */
	private double y;

	/**
	 * The constructor Point.
	 * 
	 * @param x
	 * The coordinate x.
	 * @param y
	 * The coordinate y.
	 * 
	 * @see NavalArena#addSpeedBoat(SpeedBoat)
	 * @see Point#getX()
	 * @see Point#setX(double)
	 * @see Point#getY()
	 * @see Point#setY(double)
	 * 
	 */
	public Point(Point p) {
		/**
		 * Constructs and initializes a point with the same location as the specified Point object.
		 * @param p
		 * 	the point object to be copied
		 */
		x=p.x;
		y=p.y;
	}
	/**
	 * The constructor Point.
	 * 
	 * @param x
	 * The coordinate x.
	 * @param y
	 * The coordinate y.
	 * 
	 * @see NavalArena#addSpeedBoat(SpeedBoat)
	 * @see Point#getX()
	 * @see Point#setX(double)
	 * @see Point#getY()
	 * @see Point#setY(double)
	 * 
	 */
	public Point(double x, double y){
		this.setX(x);
		this.setY(y);
		
	}
	/**
	 * The getter of the coordinate x.
	 * 
	 * @return x
	 * 	The coordinate x.
	 */
	public double getX() {
		return x;
	}

	/**
	 * The setter of the coordinate x.
	 * 
	 * @param x
	 * 	The coordinate x.
	 */
	public boolean setX(double x) {
		if(x<MIN_X)
			return false;
		if(x>MAX_X)
			return false;
		this.x = x;
		return true;
	}
	
	/**
	 * The getter of the coordinate y.
	 * 
	 * @return y
	 * 	The coordinate y.
	 */
	public double getY() {
		return y;
	}

	/**
	 * The setter of the coordinate y.
	 * 
	 * @param y
	 * 	The coordinate y. 
	 */
	public boolean setY(double y) {
		if(y<MIN_Y)
			return false;
		if(y>MAX_Y)
			return false;
		this.y = y;
		return true;
	}
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
}
