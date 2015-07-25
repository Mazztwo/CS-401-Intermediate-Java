/* CS 401 Assignment 3
 *
 *  Compilation:  javac Point.java
 *  Execution:    java Point
 *
 *  Immutable data type for 2D points.
 *
 *************************************************************************/
import java.util.Scanner;

public class Point 
{ 
    private final double x;   // Cartesian
    private final double y;   // coordinates
   
    // create and initialize a point with given (x, y)
    public Point(double x, double y) 
    {
      this.x = x;
      this.y = y;                     
    }
    public Double xCoordinate()    // [GETTER
    {
      return x;                    // METHODS
    }               
    public Double yCoordinate()    // FOR X
    { 
      return y;                    // AND Y]
    }                                
    // return Euclidean distance between invoking point this and that
    public double distanceTo(Point that) 
    {
      double distance = Math.sqrt( Math.pow((x - that.xCoordinate()),2) + Math.pow((y - that.yCoordinate()),2) );
      
      return distance;  
    }
    // draw this point using standard draw
    public void draw() {
        StdDraw.point(x, y);
    }
    // draw the line from the invoking point this to that using standard draw
    public void drawTo(Point that)
    {
        StdDraw.line(this.x, this.y, that.x, that.y);
    }
    // return string representation of this point
    public String toString() 
    {
        return "(" + x + "," + y + ")"; 
    } 
 }
