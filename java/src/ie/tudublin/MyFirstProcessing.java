package ie.tudublin;

import processing.core.PApplet;

public class MyFirstProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
        background(176, 206, 212);
        stroke(224, 139, 177);
        fill(224, 139, 177);
        
        triangle(50, 222, 200, 350, 340,210);   
	    circle(120,150,200);
        circle(260,150,200);
	}
}

