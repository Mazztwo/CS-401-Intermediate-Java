// Alessio Mazzone CS 0401 ASSIGNMENT 1

import java.util.Random;

public class RandomWalker
{
  public static void main(String[] args)
  {  
  
    double N = Double.parseDouble(args[0]);
    
    int x , y , XorY , xCoordinate = 0 , yCoordinate= 0 , squaredDistance , count;
    
    Random randomNumber = new Random();
  
    for( count = 0; count < N; count++)
    {
      
      XorY = randomNumber.nextInt(2);
      
      if(XorY == 0)
      {
        
        x = randomNumber.nextInt(2);
        
        if(x == 0)
        {
          xCoordinate = xCoordinate - 1;
          System.out.println("(" + xCoordinate + "," + yCoordinate + ")");
        } 
      
        else 
        {
          xCoordinate = xCoordinate + 1;
          System.out.println("(" + xCoordinate + "," + yCoordinate + ")");
        } 
        
      }  
  
      else if(XorY == 1)
      { 
      
        y = randomNumber.nextInt(2);
        
        if(y == 0)
        {
          yCoordinate = yCoordinate - 1;
          System.out.println("(" + xCoordinate + "," + yCoordinate + ")");
        } 
      
        else 
        {
          yCoordinate= yCoordinate + 1;
          System.out.println("(" + xCoordinate + "," + yCoordinate + ")");
        }  
          
        
      }  
      
    }  
  
    squaredDistance = (xCoordinate * xCoordinate) + (yCoordinate * yCoordinate);
    
    System.out.println("squared distance = " + squaredDistance);
  
    
  }
}  