package utilities;

/**
 * 
 * @author Emeth Genah
 * @author Reouven Mimoun
 * 
 * 
 */
public class Point {
	private double x;
	private double y;

	public Point(double x, double y){
		this.setX(x);
		this.setY(y);
		
	}
	//TODO verifier que les entree sont correct
	public double getX() {
		return x;
	}

	public void setX(double x) {
		if(x<0)
			x=0;
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		if(y<0)
			y=0;
		this.y = y;
	}
}
