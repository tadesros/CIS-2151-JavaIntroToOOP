/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomad
 */
public class RectangleDemo {
    
    public static void main(String[] args){
        
           //Going to be zero at this point. 
           System.out.println("Num Rectangles: " + Rectangle.getNumRectangles());
        
        //First line have you created a rectangle object? 
        //At this point NO
        //Only a reference to hold it. 
        Rectangle r1;
        
        
        r1 = new Rectangle();
          System.out.println("Num Rectangles: " + Rectangle.getNumRectangles());
        Rectangle r2 = new Rectangle(5.0,10.5);
         System.out.println("Num Rectangles: " + Rectangle.getNumRectangles());
        
        //Now R3 and R1 are pointing to same spot in memory
        Rectangle r3 = r1;
        
        System.out.println("Num Rectangles: " + Rectangle.getNumRectangles());
        
        System.out.println("r1 area: " + r1.area());
        System.out.println("r1 perim: " + r1.perimeter());
    
    
        System.out.println("r2 area: " + r2.area());
        System.out.println("r2 perim: " + r2.perimeter());
        
        
        r3.setLength(100);
        r3.setWidth(20);
        
    
        //REMEMBER OBJECTS When using "=" sign it's an address in memory
        
        System.out.println("r1 area: " + r1.area());
        System.out.println("r1 perim: " + r1.perimeter());
    
    
    
    }
    
}
