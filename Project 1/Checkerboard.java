CS 0401 ASSIGNMENT 1

public class Checkerboard
{
  public static void main(String[] args)
  {  
    
    int N = Integer.parseInt(args[0]);
    int count1;
    int count2;
    
    for(count1 = 0; count1 < N; count1++)
    {
  
      for(count2 = 0; count2 < N; count2++)
      {  
        
        System.out.print("* ");
 
      }
      
      System.out.println("");
      
    }  
 
  }
}  
