import TurtleGraphics.*;

import java.awt.*;

import TerminalIO.*;

public class shapeMaker {
	
	public static void main(String args[]){
		rect rect;
		shape s1, s2, s3, s4;
		rect = new rect(1,1,4,6);
		s1 = makeoneshapefromanother(rect, "circle");
		
		
	}
	
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


}
