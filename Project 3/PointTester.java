import java.util.Scanner;

public class PointTester
{
    public static void main(String[] args) 
    {
        Scanner stdin = new Scanner(System.in);
        
        // get dimensions
        int w = stdin.nextInt();
        int h = stdin.nextInt();
        StdDraw.setCanvasSize(w, h);
        StdDraw.setXscale(0, w);
        StdDraw.setYscale(0, h);
        StdDraw.setPenRadius(.005);

        // read in and plot points one at at time
        while (stdin.hasNextDouble()) {
            double x = stdin.nextDouble();
            double y = stdin.nextDouble();
            Point p = new Point(x, y);
            p.draw();
        }
  
    }
}