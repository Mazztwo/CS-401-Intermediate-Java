//CS401 Assignment 3
//to run this program, type on the compiled program: java SmallestInsertion < tsp1000.txt

import java.util.ArrayList;

public class Tour
{
  private ArrayList<Point> theTour = new ArrayList<Point>();
  
  //CREATE EMPTY TOUR
  public Tour()
  {
    this.theTour = new ArrayList<Point>();
  }
  //CREATE 4 POINT TOUR A->B->C->D->A
  public Tour(Point a, Point b, Point c, Point d)
  {
    this.theTour = new ArrayList<Point>();
    this.theTour.add(a);
    this.theTour.add(b);
    this.theTour.add(c);
    this.theTour.add(d);
    this.theTour.add(a);
  }
  //PRINT TOUR TO STANDARD OUTPUT
  public void show()
  {
    for(int i = 0; i < theTour.size(); i++)
    {
      Point p = theTour.get(i);
      System.out.println(p);
    }
  }
  //DRAW TOUR TO STANDARD DRAW
  public void draw()
  {
    for (int i = 0; i < theTour.size() - 1; i++)
    {
     Point a = theTour.get(i);
     Point b = theTour.get(i+1);
     a.drawTo(b);
    }
   
    Point c = theTour.get(0);
    Point d = theTour.get(theTour.size() - 1);
    c.drawTo(d);
    
  }
  //NUMBER OF POINTS ON TOUR
  public int size()
  {  
  
    int size = theTour.size();
    
    return size;
  }
  //RETURN TOTAL DISTANCE OF TOUR
  public double distance()
  {
    double totalDistance = 0;
    double distanceBetweenPoints = 0;
    
    for(int i = 0; i < theTour.size() -1 ; i++)
    {
      Point a = theTour.get(i);
      Point b = theTour.get(i + 1);
      
      distanceBetweenPoints = a.distanceTo(b);
      
      totalDistance += distanceBetweenPoints; 
    }
     Point c = theTour.get(0);
     Point d = theTour.get(theTour.size() - 1);  
     double finalHop = c.distanceTo(d);
     
     totalDistance += finalHop;
     
     return totalDistance; 
  }  
  //INSERT P USING NEAREST NEIGHBOR HEURISTIC
  public void insertNearest(Point p)
  {
    if(theTour.isEmpty())
    {
      theTour.add(p);
    }
    
    else if(theTour.size() == 1)
    {
      theTour.add(p);
    }
    
    else 
    {
      double distanceToPoint = 0;
      double initialDistance = p.distanceTo(theTour.get(0));
      int insertIndex = 0;  
      
      for(int i = 0; i < theTour.size(); i++)
      {
        distanceToPoint = p.distanceTo(theTour.get(i));
     
        if(distanceToPoint < initialDistance)
        {
          initialDistance = distanceToPoint;
          insertIndex = i;
        }
      }
      theTour.add(insertIndex + 1, p);
    } 
  }
  //INSERT P USING SMALLEST INCREASE HEURISTIC
  public void insertSmallest(Point p)
  {
     if(theTour.isEmpty())
    {
      theTour.add(p);
    }  
    else if(theTour.size() == 1)
    {
      theTour.add(p);
    }
    else 
    {
      double smallestTourDistance = ( p.distanceTo(theTour.get(0)) + p.distanceTo(theTour.get(1)) ) - theTour.get(0).distanceTo(theTour.get(1));
      int insertIndex = 0;
      double newDistance = 0;
      
      for(int i = 0; i < theTour.size() - 1; i++)
      {
        newDistance = ( p.distanceTo(theTour.get(i)) + p.distanceTo(theTour.get(i + 1)) ) - theTour.get(i).distanceTo(theTour.get(i + 1));
        
        if(newDistance < smallestTourDistance)
        {
         smallestTourDistance = newDistance;
         insertIndex = i;           
        }
      }
      double finalTestDistance = p.distanceTo(theTour.get(0)) + p.distanceTo(theTour.get(theTour.size() - 1)) - theTour.get(0).distanceTo(theTour.get(theTour.size() - 1));
      if(finalTestDistance < smallestTourDistance)
      {
        theTour.add(p);
      }
      else  
        theTour.add(insertIndex + 1, p); 
    }
  }
}
