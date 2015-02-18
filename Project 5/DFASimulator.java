//Alessio Mazzone CS401 Assignment 5

import java.io.*;

public class DFASimulator{
    private DFA dfa;
    private Tape tape;
    
    public DFASimulator(DFA dfa){
      this.dfa = dfa;
    }
   
    /* Initialize tape by using the string t. Start at the start state of the dfa, i.e., 
       state = startState. For each character
       ch on the Tape, make a transition to delta[state][index(ch)] 
       which becomes the new state (display this transition), 
       continue until the last character on the Tape is processed. 
       If the state is a final state display "ACCEPT", otherwise, 
       display "REJECT". See the output produced for "dragon_slayer.dat". 
    */
    public void run(String t){
     tape = new Tape(t);
     
     int state = dfa.startState();
     int[][] delta = dfa.transitions();
     int newState = 0;
     char ch = 'a';
     
     String alphabet = dfa.getAlphabet();
     String alphabeticString = "";
     String phaseString = "";
     
     for(int i = 0; i < t.length(); i++)
     {
       ch = t.charAt(i);
       
       alphabeticString += " " + ch + " "; 
       phaseString += state + "->";
       
       newState = delta[state][alphabet.indexOf(ch)];
       state = newState;
     }
     
     phaseString += newState;
     
     System.out.println("\nProcessing tape:");
     System.out.println(alphabeticString);
     System.out.println(phaseString);

       if(dfa.finalStates()[newState])
       {
         System.out.println("ACCEPT TAPE");
       }
       else
       {
         System.out.println("REJECT TAPE");
       }
     
    }
  
    public static void main(String[] args)throws IOException{
        DFA dfa = new DFA("dragon_slayer.dat");
        System.out.println(dfa);
        dfa.displayTransitions();
        
        DFASimulator sim = new DFASimulator(dfa);
        sim.run("#>FFFT#T>>F>FD#FT>FDF>#");      
        sim.run("F>FD#>TFDT");
        sim.run("F>FD#>TFD");
    }
}