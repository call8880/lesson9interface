import TurtleGraphics.*;


public class Wheel extends circle{

	private int spokes;
	
	public Wheel(){
		super();
		spokes = 0;
	}
	public Wheel(double xLoc, double yLoc, double r, int s){
		super(xLoc, yLoc, r);
		spokes = s;
	}
	
	public void draw(Pen p){
		super.draw(p);
		for (int x = 0; x <= spokes; x++){
			p.up();
			p.move(xPos, yPos);
			p.setDirection(x * 360 / spokes);
			p.down();
			p.move(radius);
		}
	}
	public void setSpokes(int s){
		spokes = s;
	}
	public String toString(){
		String str = "Wheel\nRadius: " + radius + "\nSpokes" + spokes + "\n(x,y)Position: (" + xPos +","+ yPos + ")\nArea" + area();
		return str;
	}
}
