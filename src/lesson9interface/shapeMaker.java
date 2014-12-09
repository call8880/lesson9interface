package lesson9interface;

import TurtleGraphics.*;

import java.awt.*;

import TerminalIO.*;

public class shapeMaker {
	
	public static void main(String args[]){
		Pen p = new StandardPen();
		shape s;
		double r, x, y, w, h;//xpos, ypos, radius, height, and width
		int choice;
		KeyboardReader read = new KeyboardReader();
		
		//choose shape
		while(true){
			choice = read.readInt("Enter a 1 for a rectangle or a 2 for a circle: ");
			if (choice == 1 || choice == 2) break;
		}
		if (choice == 1){
			w = read.readDouble("Enter the width of the rectangle: ");
			h = read.readDouble("Enter the height of the rectanglt: ");
			s = new rect(0, 0, w, h);
		}
		else {
			r = read.readDouble("Enter the radius of the circle: ");
			s = new circle(0,0,r);
		}
		while(true){
			s.draw(p);
			x = read.readDouble("Enter the x position of the shape: ");
			y = read.readDouble("Enter the y position of the shape: ");
			//move the pen to the x,y position
		p.setColor(Color.white);
		s.draw(p);
		s.move(x, x);
		//draw the shape at x,y
		p.setColor(Color.GREEN);
		s.draw(p);
		System.out.println("Shape Drawn");
		}
		
	
	}
	


}
