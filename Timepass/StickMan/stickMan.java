package StickMan;

import java.applet.Applet;
import java.awt.*;

public class stickMan extends Applet
{
	public void paint (Graphics page)
	{
		   
	    setBackground(Color.black);
	    setForeground(Color.red);
	    
	    // draw a boundary 
	    page.drawRect(5,5,190,190);
	    
	    // the head
	    page.drawOval(90,60,20,20);
	    
	    // the body
	    page.drawLine(100,80,100,120);
	    
	    // the hands
	    page.drawLine(100,100,80,100);
	    page.drawLine(100,100,120,75);
	    
	    // the legs
	    page.drawLine(100,120,85,135);
	    page.drawLine(100,120,115,135);
	    
	    // the greeting
	    page.drawString("Hi there! I wanna party", 20, 180);
	    
	 }
}