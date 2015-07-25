//CS401 Assignment 5

import java.util.*;

public abstract class AbstractDFA{
    private String machineName;  //name of machine
    private String alphabet;     //alphabet
    
    public AbstractDFA(String nameofmachine){
        machineName = nameofmachine;
    }
    
    
    
    public AbstractDFA(String nameofmachine, String alphabet){
        this(nameofmachine);
        this.alphabet = alphabet;    //Must call the above constructor
    }

    
    
    public abstract int numberOfStates();
    public abstract int startState();
    public abstract boolean[] finalStates();
    public abstract int[][] transitions();
    
    
    /*Returns the string consisting of the machine's name and its alphabet. For example, for "dragon_slayer.dat"
       Machine Name: dragon_slayer
       Alphabet: {F, D, T, >, #}
    */
    public String toString(){
        StringBuffer name = new StringBuffer(machineName);
        char[] theAlpha = new char[alphabet.length()];
        
        for(int i = 0; i <  theAlpha.length; i++)
        {
           theAlpha[i] = alphabet.charAt(i);
        }
        
         
        return "Machine Name: " + name.delete(name.length() - 4, name.length()) +  "\nAlphabet : " + Arrays.toString(theAlpha) ;  
    }
    

    /* Change the alphabet to the specified string. */
    public void setAlphabet(String alpha){
       alphabet = alpha;
    }
    
    
    /* Return the alphabet to the caller.*/
    public String getAlphabet(){
        return alphabet;
    }
}
