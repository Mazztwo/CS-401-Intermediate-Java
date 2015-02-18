import java.awt.*;


public class IronPuzzleSolver
  
{
  public static void main(String[] args)
  {
    
    Picture picture = new Picture("iron-puzzle.png");
    
    
    
    int width = picture.width();                           
    int height = picture.height(); 
    
    for(int x = 0; x < width ; x++)
      {
        for(int y = 0; y < height ; y++)
        {  
          
          
            Color pixel = picture.get(x,y);

            int red = pixel.getRed();
            int green = pixel.getGreen();
            int blue = pixel.getBlue();
            
            red = 10 * red;
            green = 0;
            blue = 0;
            
            picture.set(x,y,new Color(red,blue,green));
            
            
            
        }
        
    }
    
     picture.show();
   picture.save("iron puzzle extra credit picture.png"); 
  }
}