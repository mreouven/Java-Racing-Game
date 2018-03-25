package utilities;

/**
 * 
 * @author Emeth Genah
 * @author Reouven Mimoun
 * 
 * 
 */
public class Point {
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
		if(x<0)
			x=0;
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
		if(y<0)
			y=0;
		this.y = y;
	}
}
