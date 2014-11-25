import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;


public abstract class abstractShape implements shape{
	
	protected double xPos, yPos;
	
	public abstractShape(){
		 xPos = 0;
		 yPos = 0;
	}
	public abstractShape(double x, double y){
		xPos = x;
		yPos = y;
	}
	
	public abstract double area();
	public abstract void draw(Pen p);
	public abstract void strechBy(double fact);
	public abstract double perimeter();
	public final double getXPos() {
		return xPos;
	}
	public final double getYpos(){
		return xPos;
	}
	public void move(double xLoc, double yLoc){
		xPos = xLoc;
		yPos = yLoc;
	}
	public String toString(){
		String str = "(x,y) Position = " + xPos + "," + yPos;
		str += "\nArea = " + area();
		str += "\nPerimeter =" + perimeter();
		return str;
	}
	
	

}
