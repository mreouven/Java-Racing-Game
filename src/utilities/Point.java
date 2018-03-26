package utilities;

/**
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
	//TODO verifier que les entree sont correct
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
	public void setX(double x) {
		if(x<MIN_X)
			x=0;
		if(x>MAX_X)
			x=MAX_X;
		this.x = x;
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
	public void setY(double y) {
		if(y<MIN_Y)
			y=0;
		if(y>MAX_Y)
			y=MAX_Y;
		this.y = y;
	}
	@Override
	public String toString() {
		return " "+x+" "+y;
	}
}
