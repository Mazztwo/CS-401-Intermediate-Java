// Project 1

public class RGBtoCMYK
{
  public static void main(String[] args)
  {  

    double red = Double.parseDouble(args[0]);
    double green = Double.parseDouble(args[1]);
    double blue = Double.parseDouble(args[2]);
    
    if(red == 0 && green == 0 && blue == 0)
    {  

      System.out.println("cyan = 0.0");
      System.out.println("magenta = 0.0");
      System.out.println("yellow = 0.0");
      System.out.println("black = 1.0");
  
      System.exit(0);
    }
    
    double R = red / 255;
    double G = green / 255;
    double B = blue / 255;
    
    
    double white = Math.max(R,Math.max(G,B));
    double cyan = (white - (red/255))/ white;
    double magenta = (white - (green/255))/ white;
    double yellow = (white - (blue/255))/ white;
    double black = 1 - white;
    
    System.out.println("cyan = " + cyan);
    System.out.println("magenta = " + magenta);
    System.out.println("yellow = " + yellow);
    System.out.println("black = " + black);
  
  }
}  
  
