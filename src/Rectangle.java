/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomad
 */
public class Rectangle {
    //Private Data members called Fields
    //PROPERLY "INSTANCE FIELDS"
    //Owned by the object not the class
    private double length;
    private double width;
    
    //Automatically initialized to zero.
    private static int numRectangles;
    
    
    
    //Constructors
    public Rectangle()
    {
        //HERE NO NAME SHADOWING
        //YOU DO NOT NEED THIS Technically.
        //YOu can do this
        this(1.0, 1.0);
        
        //No need for numRectangles++ you would be double counting it. 
        
        
    }//End no-arg constructor not really default wrong name
     //Without it compiler provides it and it is default 
     //Since we are writing it no-arg
     //CTOR = means constructor
    
    //Overloaded constructor
    //Called Paramaterized
    public Rectangle(double length, double width)
    {
        //this -> passed into the method by default
        //Implicit parameter 
        //must use this to refer to the data member
        //When same name called "Name Shadowing" 
        //Recommended method by professor use this
        this.length = length;
        this.width = width;
        
        
        //Increment numRectangles
        numRectangles++;
        
    }//End Arg Constructor

    
    //IMMUTABLE: Lacking setters -> Can't change
    //Mutable: have setters      -> Can change
    
    
    
    
    //Accessor
    public double getLength() {
        return length;
    }
    //Mutator
    public void setLength(double length) {
        this.length = length;
    }
    //Accesor
    public double getWidth() {
        return width;
    }
    //Mutator
    public void setWidth(double width) {
        this.width = width;
    }
    
    //Get Area
    public double area(){
        return length * width;
    }//End area method
    
    
    //Get Perimeter
    public double perimeter(){
        return 2 * (length + width);
    }
    
    
    public static int getNumRectangles()
    {
        return numRectangles;
    }
    
}//End Class
