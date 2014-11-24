

import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

public class circle extends abstractShape{

	
	protected double radius;
	
	public circle(){
		super();
		radius = 1;
	}
	public circle(double x, double y, double r){
		super(x,y);
		radius = r;
	}
	

	public double area() {
		return Math.PI * radius * radius;
	}

	public void draw(Pen p) {	
		double side = 2.0 * Math.PI * radius/ 120.0;
		p.up();
		p.move(xPos + radius, yPos - side / 2.0);
		p.setDirection(90);
		p.down();
		for (int x = 0; x < 120; x++){
			p.move(side);
			p.turn(3);
		}
		
	}

	public void strechBy(double factor) {
		radius *= factor;
		
	}
	
	public String toString(){
		String str = "This is a circle\n";
		str += "radius = " + radius;
		str += "\n" + super.toString();
		return str;
	}
	public double perimeter(){
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

}
