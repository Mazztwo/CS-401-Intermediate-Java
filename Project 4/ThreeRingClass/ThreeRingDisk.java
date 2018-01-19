//Three Ring Disk class for Enygma GUI

import java.util.*;

public class ThreeRingDisk
{
  private ArrayList<String> innerRing = new ArrayList<String>();
  private ArrayList<String> middleRing = new ArrayList<String>();
  private ArrayList<String> outerRing = new ArrayList<String>();
  
  private ArrayList<String> innerRingCopy = new ArrayList<String>();
  
  public ThreeRingDisk() 
  {
    this.innerRing = new ArrayList<String>();
    this.middleRing = new ArrayList<String>();
    this.outerRing = new ArrayList<String>();
    
    setOuter("#BDFHJLNPRTVXZACEGIKMOQSUWY");
  }  
  private ThreeRingDisk(String outr) 
  {
    this.setOuter(outr);
  }
  public void setInner(String innr)
  {
    char[] positions = innr.toCharArray();
    
    for(int i =0; i < positions.length; i++)
    {
      innerRing.add(Character.toString(positions[i]));
    }
    
    for(int i = 0; i < innerRing.size(); i++)
    {  
      innerRingCopy.add(innerRing.get(i));
    }
  }
  
  public void setMiddle(String midl)
  {
    char[] positions = midl.toCharArray();
    
    for(int i =0; i < positions.length; i++)
    {
      middleRing.add(Character.toString(positions[i]));
    } 
  }
  private void setOuter(String outr) //only the creator can set the outer rotor
  {
    char[] positions = outr.toCharArray();
    
    for(int i =0; i < positions.length; i++)
    {
      outerRing.add(Character.toString(positions[i]));
    } 
  }
  public void rotate() //manages rotating the inner and middle rotor
  {
    String lastIndex = innerRing.get(innerRing.size() - 1);
    
    innerRing.remove(innerRing.size() - 1);
    innerRing.add(0, lastIndex);
    
    if(innerRing.get(0).equals(innerRingCopy.get(0)))
    {
      String finalIndex = middleRing.get(middleRing.size() - 1);
      
      middleRing.remove(middleRing.size() - 1);
      middleRing.add(0 , finalIndex);
      
    }
   
   }
  public char encrypt(char c) //encrypt the character c
  {
    int innerIndex = 0;
    String outerCharacter = "a";
    int middleIndex = 0;
    
    String theChar = Character.toString(c);
    
    for(int i = 0; i < innerRing.size(); i++)
    {
      if(innerRing.get(i).equals(theChar))
      {
        innerIndex = i;
        i = innerRing.size();
      }
    }  
    outerCharacter = outerRing.get(innerIndex);
    
    for(int j = 0; j < middleRing.size(); j++)
    {
     if(middleRing.get(j).equals(outerCharacter))
     {
       middleIndex = j;
       j = middleRing.size();
     }
    }  
    String returnChar = outerRing.get(middleIndex);
    
    this.rotate();
    return returnChar.charAt(0);
  }  
  public char decrypt(char c) //decrypt the character c
  {
    int outerIndex = 0;
    String theChar = Character.toString(c);
    int outerIndex2 = 0;
    
    for(int i = 0; i < outerRing.size(); i++)
    {
      if(outerRing.get(i).equals(theChar))
      {
        outerIndex = i;
        i = outerRing.size();
        
      }
    } 
    String middleChar = middleRing.get(outerIndex);  
    
    for(int j = 0; j < outerRing.size(); j++)
    {
      if(outerRing.get(j).equals(middleChar))
      {
        outerIndex2 = j;
        j = outerRing.size();
      }
    }  
    String returnChar = innerRing.get(outerIndex2);
    
    this.rotate();
    return returnChar.charAt(0);  
  }
  public String toString() //display outer, middle, and inner rotors
  {
    
    return outerRing + "\n" + middleRing + "\n" + innerRing + "\n";
  }
}
