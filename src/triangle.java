import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

public class triangle extends abstractShape{

	private double x2, y2, x3, y3;
	
	public triangle(){
		super();
		x2 = 50;
		y2 = 50;
		x3 = 100;
		y3 = 0;
	}
	
	public void move(double xLoc, double yLoc){
		xPos -= xLoc;
		yPos -= yLoc;
		x2 -= xLoc;
		x3-= xLoc;
		y2 -= yLoc;
		y3 -= yLoc;
	}
	
	public double area() {
		return Math.abs((xPos*y2-x2-yPos) + (x2*y3 - x3*y2) + (x3*yPos-xPos*y3))/2;
	}


	public String toString() {
		String str = "This is a Triangle";
		str += "\n" + super.toString();
		return str;
	}

	public void draw(Pen p) {
		p.up();
		p.move(xPos,yPos);
		p.down();
		p.move(x2,y2);
		p.move(x3,y3);
		p.move(xPos,yPos);
	}
	
	public double perimeter(){
		return Math.sqrt((xPos-x2)*(xPos-x2)+(yPos-y2)*(yPos-y2));
	}
	public void strechBy(double fact){
		x2 = (x2 - xPos) * fact + xPos;
		x3 = (x3 - xPos) * fact + xPos;
		y2 = (y2 - yPos) * fact + yPos;
		y3 = (y3 - yPos) * fact + yPos;
	}

}
