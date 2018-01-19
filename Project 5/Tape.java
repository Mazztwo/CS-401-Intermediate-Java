//Project 5

public class Tape{
    private String tape;
    
    public Tape(String s){
      tape = s;
    }
    
    
    public int size(){
        return tape.length();
    }
    
    
    
    public char getChar(int n){
        return tape.charAt(n);
    }
    
    
    
    public String toString(){
        return tape;
    }
    
    

    
    
        public static void main(String[] args){
        Tape t = new Tape("F>FD#>TFDT");
        System.out.println(t);
        System.out.println(t.size());
        System.out.println(t.getChar(t.size()-2));
        
        
        Tape t2 = new Tape("1111111111111111111110");
        System.out.println(t2);
        System.out.println(t2.size());
        System.out.println(t2.getChar(t2.size()-1));
        
    }
}
