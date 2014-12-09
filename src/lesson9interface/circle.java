package lesson9interface;

import TurtleGraphics.Pen;

public class circle implements shape{

	
	private double xPos, yPos, radius;
	
	public circle(){
		xPos = 0;
		yPos = 0;
		radius = 1;
	}
	public circle(double x, double y, double r){
		xPos = x;
		yPos = y;
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
		radius *= factor;
		
	}
	
	public String toString(){
		String str = "This is a circle\n";
		str += "xloc: " + xPos + "\nyloc: " + yPos + "\n";
		str += "Area: " + area();
		str += "\nRadius: " + radius;
		return str;
	}
}
