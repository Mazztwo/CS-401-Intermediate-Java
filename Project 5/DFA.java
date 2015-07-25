//CS401 Assignment 5

import java.io.*;
import java.util.*;

public class DFA extends AbstractDFA{
    private int numberOfStates;       //number of states
    private int start;                //start state
    private int[][] delta;            //numberOfStates-by-numberOfSymbolsInAlphabet transition array
    private boolean[] finalStates;    //set of final states
    
    
    /* Create a DFA from the file whose name is provided. */
    public DFA(String fileName)throws IOException{
      super(fileName);
      readDFA(fileName);
      
    }
  
    public DFA(String name, String alpha, int numStates, int start, int[][] delta, boolean[] finalstates){
        super(name);
        setAlphabet(alpha);
        numberOfStates = numStates;
        this.start = start;
        this.delta = delta;
        finalStates = finalstates;
    }
    
    
    /* Read in a DFA from a file. Note: the machine name is the name of the file without extension. */
    private void readDFA(String fileName) throws IOException { 
      File file = new File(fileName);
      Scanner inputFile = new Scanner(file);
      
      numberOfStates = Integer.parseInt(inputFile.nextLine());
      start = Integer.parseInt(inputFile.nextLine());
      super.setAlphabet(inputFile.nextLine());
      delta = new int[numberOfStates][super.getAlphabet().length()];
      finalStates = new boolean[numberOfStates];
      
      for(int i = 0; i < finalStates.length; i++)
      {
        finalStates[i] = false;
      }
      
      String theLine = inputFile.nextLine();
        
      while(! (theLine.equals("-1")) )
      {
        String rawr = "" + theLine.charAt(0);
        String rawr2 = "" + theLine.charAt(2);
        String rawr3 = "" + theLine.charAt(4);
        
        int firstIndex = Integer.parseInt(rawr);
        int secondIndex = super.getAlphabet().indexOf(rawr2);
        int deltaValue = Integer.parseInt(rawr3);
        
        delta[firstIndex][secondIndex] = deltaValue;
        
        theLine = inputFile.nextLine();
      }
      
      String anotherLine = inputFile.nextLine();
      
      while(!(anotherLine.equals("-1")))
      {
        finalStates[Integer.parseInt(anotherLine)] = true;
        
        anotherLine = inputFile.nextLine(); 
      } 
    }
   
    /* Return the number of states. */
    public int numberOfStates(){
        return numberOfStates;
    }
    
    
    /* Return the start state. */
    public int startState(){
        return start;
    }
    
    
     /* Return a reference to the final states. */
    public boolean[] finalStates(){
        return finalStates;
    }
    
    
    /* Return a reference to the array of transitions. */
    public int[][] transitions(){
        return delta;
    }
    
    
    /* Returns a string representation for this DFA. For example, for "dragon_slayer.dat"
       Machine Name: dragon_slayer
       Alphabet: {F, D, T, >, #}
       States: {0, 1, 2, 3, 4}
       Final States: {0, 1, 2, 3}
    */
    public String toString(){
          
         int[] states = new int[numberOfStates]; 
         
         for(int i = 0; i < states.length; i++)
         {
           states[i] = i ;
         }
          
         ArrayList<Integer> theFinalStates = new ArrayList<Integer>();
         
         for(int j = 0; j < finalStates.length; j++)
         {
           if(finalStates[j])
             
             theFinalStates.add(j);
           
         }
                                                     
         
         return super.toString() + "\nStates: " + Arrays.toString(states) + "\nFinal States: " + theFinalStates.toString()  ;
    }    
          
    /* Displays all transitions for this DFA. For example, for "dragon_slayer.dat"
       Transition Table: 
            (0, F)->0
            (0, D)->4
            (0, T)->4
            (0, >)->1
            (0, #)->3
            (1, F)->1
            (1, D)->0
            (1, T)->4
            (1, >)->1
            (1, #)->2
            (2, F)->2
            (2, D)->3
            (2, T)->1
            (2, >)->2
            (2, #)->2
            (3, F)->3
            (3, D)->4
            (3, T)->0
            (3, >)->2
            (3, #)->3
            (4, F)->4
            (4, D)->4
            (4, T)->4
            (4, >)->4
            (4, #)->4
    */
    public void displayTransitions(){
      
      String alpha = super.getAlphabet();
      
      System.out.println("\nTransition Table:");
      for(int i = 0; i < delta.length; i++)
      {
        for(int k = 0; k < delta[i].length; k++)
        {
          System.out.println("\t(" + i + ", " + alpha.charAt(k) + ")->" + delta[i][k] );
        }
      }
    }
    
    
    
    public static void main(String[] args)throws IOException
   {
        DFA dfa = new DFA("dragon_slayer.dat");
        System.out.println(dfa);
        dfa.displayTransitions();
    }
}
