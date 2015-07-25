// CS 0401 ASSIGNMENT 1

public class Ordered
{
  public static void main(String[] args)
  {
  
    boolean isOrdered = true;
    
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double z = Double.parseDouble(args[2]);
    
   if( x > y  && y > z)
   {
     isOrdered = true;
     System.out.println(isOrdered);
   }
   else if ( x < y && y < z)
   {
     isOrdered = true;
     System.out.println(isOrdered);
   } 
   else
   {   
     isOrdered = false;
     System.out.println(isOrdered);
   }
  
   
  } 
}
