public class Test
{
 public static void main(String[] args)
 {  
  ThreeRingDisk yay = new ThreeRingDisk();
  yay.setInner("#GNUAHOVBIPWCJQXDKRYELSZFMT");
  yay.setMiddle("#EJOTYCHMRWAFKPUZDINSXBGLQV");
   
  String messageToDecrypt = "TDPWNHHMAEHDFOERRSOMIGWQSBJEYYODVWKQPJYUYGCDHGANOSM";
  StringBuffer woo = new StringBuffer();
  
  for(int i = 0; i < messageToDecrypt.length(); i++)
  {
    woo.append(Character.toString(yay.decrypt(messageToDecrypt.charAt(i))));
  }
  
  System.out.println(); 
 }
}