

import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

public class rect extends abstractShape {
	
	private double width, height;
	
	public rect(){
		super();
		width = 1;
		height = 1;
	}
	public rect(double x, double y, double w, double h){
		super(x,y);
		height = h;
		width = w;
	}


	public double area() {
		return width * height;
	}

	public void draw(Pen p) {
		p.up();
		p.move(xPos, yPos);
		p.down();p.setDirection(0);
		p.move(width);
		p.turn(-90); 
		p.move(height);
		p.turn(-90);
		p.move(width);
		p.turn(-90);
		p.move(height);
		
	}


	public void strechBy(double factor) {
		height *= factor;
		width *= factor;
		
	}	
	
	public String toString(){
		String str = "This is a rectangle\n";
		str += "\nWidth: " + width;
		str += "\nheight: " + height;
		str += "\n" + super.toString();
		return str;
	}
	public double perimeter(){
		double perimeter = 2 * height + 2 * width;
		return perimeter;
		
	}
}
