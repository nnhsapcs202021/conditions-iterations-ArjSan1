import java.util.Scanner;
/**
 * Write a description of class Notes here.
 *
 * @author ArjSan1
 * @version (a version number or a date)
 */
public class Notes
{
    public static void whileExample()
    {
        /*
         * While loop:
         *     evaluates a boolean expression
         *      if true, executes the body of the loop and then re-evaluates the condition
         *      if false, skips the body and continues
         *  
         */
        int count = 1;              // initialization

        while(count <= 5)               // condition
        {
            System.out.println(count);       //body

            count++;                      // update the loop variable
        }
        System.out.print("done");      

    }
    public static void whileExample2()
    
    {
        /*
         * This is an example of an infinite loop!
         * 
         * A better condition would be while(count < 50)
         */
        int count = 1;         // initialization

        while (count < 50)           // condition

        {
            System.out.println(count);       //body

            count+=2;                      // update the loop variable

        }
                System.out.print("done");      

    }
}
