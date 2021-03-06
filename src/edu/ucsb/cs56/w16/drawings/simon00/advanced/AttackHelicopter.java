package edu.ucsb.cs56.w16.drawings.simon00.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   Attack Helicopter
      
   @author Simon Huynh 
   @version for CS56, W16, UCSB
   
*/
public class AttackHelicopter extends Copter implements Shape
{
    /** 
	Constructor of AttackHelicopter using Copter, no changes to parameters
    */
    public AttackHelicopter(double x, double y, double width, double length, double radius)
    {
	// construct the basic copter
	super(x,y,width,length,radius);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	double missilesX = x - (width); 
	double missilesY = y + (length * 0.5) - (width); 
	
	Rectangle2D.Double missiles =
	    new Rectangle2D.Double(missilesX, missilesY, width*3, length*0.20);

	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath helicopter = this.get();
        helicopter.append(missiles, false);
      
    }    
}
