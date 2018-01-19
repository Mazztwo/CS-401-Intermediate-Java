// Project 5

import java.io.*;

public class AB_DFA_Tester
{

public static void main(String[] args)throws IOException
{
        DFA dfa = new DFA("A_B_DAT.txt");
        System.out.println(dfa);
        dfa.displayTransitions();
        
        DFASimulator sim = new DFASimulator(dfa);
        sim.run("AAAAAABBB");      
        sim.run("BABBAABAAABBAAB");
        sim.run("AABBAABBAABBAABBAABB");
        sim.run("");
        sim.run("ABBABBABABAAB");
        sim.run("BABA");
        sim.run("BAABABBABBBBABAAAAAAAA");
    }
}
