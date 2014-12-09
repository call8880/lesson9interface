package lesson9interface;

import TurtleGraphics.Pen;

public class rect implements shape{
	
	private double xPos, yPos, width, height;
	
	public rect(){
		xPos = 0;
		yPos = 0;
		width = 1;
		height = 1;
	}
	public rect(double x, double y, double w, double h){
		xPos = x;
		yPos = y;
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


	public double getXPos() {
		return xPos;
	}

	public double getYPos() {
		return yPos;
	}
	
	public void move(double xloc, double yloc) {
		xPos = xloc;
		yPos = yloc;
		
	}


	public void strechBy(double factor) {
		height *= factor;
		width *= factor;
		
	}
	
	public String toString(){
		String str = "This is a rectangle\n";
		str += "xloc: " + xPos + "\nyloc: " + yPos + "\n";
		str += "Area: " + area();
		str += "\nWidth: " + width;
		str += "\nheight: " + height;
		return str;
	}
}
