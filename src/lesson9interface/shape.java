package lesson9interface;

import TurtleGraphics.*;

public interface shape {
	
	public double area();
	public void draw(Pen p);
	public double getXPos();
	public double getYPos();
	public void move(double xloc, double yloc);
	public void strechBy(double factor);
	public String toString();

}
