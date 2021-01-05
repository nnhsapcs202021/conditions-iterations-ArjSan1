import java.util.Random;
import java.lang.Math;
/**
 * Write a description of class RandomWalk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomWalk
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Random r = new Random();
        for (int i = 0; i < 100; i++)
        {
            int rand = r.nextInt(4)+1;

            if (rand == 1)
            {
                x = x+1;
            }
            else if (rand == 2)
            {
                x = x -1;   
            }
            else if (rand == 3)
            {
                y = y+1;
            }
            else
            {
                y = y-1;
            }
        }
        System.out.println("The final coordinates of the man is: " + "(" + Math.abs(x) + "," + Math.abs(y) +")" );
    }
}
