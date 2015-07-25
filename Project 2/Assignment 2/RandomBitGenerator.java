//CS 401 Assignment 2 
//Random Bit Generator Class
//This program is a LFSR simulator used in the Photo Magic encryption program.

public class RandomBitGenerator
{
  
  public static int step(StringBuffer bits, int tapbit)
  {
    String rightMostBit;
    
    if(bits.charAt(0) == bits.charAt((bits.length() - 1) - tapbit))
      rightMostBit = "0";
    else
      rightMostBit = "1";
     
    bits.deleteCharAt(0);
    bits.append(rightMostBit);
    
    return Integer.parseInt(rightMostBit); 
  }
  
  public static String generate(int k, StringBuffer bits, int tapbit)
  {
    String rightMostBit;
    StringBuffer product = new StringBuffer("");
    
    for(int j = 0; j < k; j ++)
    {
      if(bits.charAt(0) == bits.charAt((bits.length() - 1) - tapbit))
        rightMostBit = "0";
      else
        rightMostBit = "1";
      
      bits.deleteCharAt(0);
      bits.append(rightMostBit);
      
      product.append(rightMostBit); 
    }
    return product.toString();
    
  }  
}  
