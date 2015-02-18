//Alessio Mazzone 
// CS 0401 Assignment 2
//This program takes the pipe photo and encrypts it. If you run te program on the encrypted photo, the original will be shown
//To run this program, provide type a picture name, a string of bits and a tapbit in the command line.


import java.awt.*;

public class PhotoMagic
{
  public static void main(String[] args)
  {
    
   Picture picture = new Picture(args[0]);
   StringBuffer bits = new StringBuffer(args[1]);
   int tapbit = Integer.parseInt(args[2]);
 
   Picture encryptedPicture = transform(picture, bits, tapbit);
   encryptedPicture.show();
   encryptedPicture.save("encrypted_" + args[0]); 
    
  }
  
  public static Picture transform(Picture picture, StringBuffer bits, int tapbit)
  {
    
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
            
     
            String xOrString = "";
            xOrString = RandomBitGenerator.generate(8 , bits , tapbit);
             
            
            byte generatedByte = 0;
            byte redByte = 0;
            byte greenByte = 0;
            byte blueByte = 0;
            
            if(xOrString.charAt(0) == '0')
            {
              generatedByte = Byte.valueOf(xOrString,2);
            }

          
            else
            {
              generatedByte = Byte.valueOf("-" + twoscomp(xOrString), 2);
            }
        
            
            
            if(red <= 127)
            {
              redByte= (byte)red;
            }
            else 
            {
              redByte = (byte)(red - 256);
            }
            
            if(green <= 127)
            {
              greenByte = (byte)green;
            }
            else 
            {
              greenByte = (byte)(green - 256);
            }
            
            if(blue <= 127)
            {
              blueByte = (byte)blue;
            }
            else 
            {
              blueByte = (byte)(blue - 256);
            }
            
            int newRed = (byte)(redByte ^ generatedByte);
            int newGreen =(byte)(greenByte ^ generatedByte);
            int newBlue = (byte)(blueByte ^ generatedByte);
            
            
              
            if(newRed < 0)
            {
              newRed = newRed + 256;
            }
    
            if(newGreen < 0)
            {
              newGreen = newGreen + 256;
            }
           
            if(newBlue < 0)
            {
              newBlue = newBlue + 256;
            }
            
            
            
            picture.set(x,y,new Color(newRed,newBlue,newGreen));
       } 
       
     }

    
    return picture; 
  } 
  
 public static String twoscomp(String s)
  {
    
    String s1 = s.replace("0","A");
    String s2 = s1.replace("1","0");
    String s3 = s2.replace("A","1");
    
    StringBuffer sb = new StringBuffer(s3);
    
    
    int x =s3.length()-1;
    while(s3.charAt(x) == '1')
   {
     sb.setCharAt(x,'0');
     x--;
  
   } 
   sb.setCharAt(x,'1');
    
    
    return sb.toString();   
  } 
  
}