import TurtleGraphics.StandardPen;


public class abstractShape {
	
	static private shape makeoneshapefromanother(shape inShape, String type){
		shape outshape;
		double area, radius, width, height;
		double x = inShape.getXPos();
		double y = inShape.getYPos();
		
		area = inShape.area();
		
		if (type.equals("Circle")){
			radius = Math.sqrt(area/Math.PI);
			outshape = new circle(x,y,radius);
		}
		else if (type.equals("Rectangle")){
			width = height = Math.sqrt(area);
			outshape = new rect(x,y,width,height);
		}
		else {
			radius = Math.sqrt(area/Math.PI);
			outshape = new Wheel(x,y,radius, 6);
		}
		return outshape;
	}

	public void draw(StandardPen p) {
		
		
	}

	public void move(double x, double y) {
	
		
	}

}
