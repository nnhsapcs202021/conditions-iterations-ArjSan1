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

    public static void forExample()
    {
        /*
         * for loop:
         * 
         *      three parts of the for loop statement
         *      1. initialization - executed once
         *      2. condition - boolean expression evaluated at the start of ewach iteration
         *      3. update the loop variable - executed at the end of each iteration, before evaluating the condition again
         *      
         */
        for(int count = 1; //initialization
        count <= 5;   // condition
        count ++)    //update the loop variable

        {
            System.out.println(count);       //body
        }
        System.out.print("done"); 
        /*
         * variables declared with the for state are scoped to the for statement and its body
         */
        //System.out.println("final value of count: " + count);       

    }

    public static void forExample2()
    {
        int count=1;

        for( ; //initialization
        count <= 5;   // condition
        count ++)    //update the loop variable

        {
            System.out.println(count);       //body
        }
        System.out.print("done"); 

        System.out.println("final value of count: " + count);       

    }

    public static void offByOne()
    {
        /*
         * the infamous off by one error is common with for loops executing one too many 
         *      or one too few times
         *      
         * Carefully ask:
         *          should the initial value start at zero or one?  (usually we start at 0)
         *          should the condition operator be < or <= ?   (usually <)
         *          
         *     "Think! Don't compile and try at random!"
         */
        // we want to print five "*"
        for(int i = 0; //initialization
        i <= 5; //condition          // should be i<5
        i++) // update the loop variable
        {
            System.out.println("*");       //body

        }
        System.out.print("done"); 

    }
    public static void doExample()
    {
     
        /*
         * do-loop (do-while loop):
         *  
         *  1. executes the body of the loop
         *  2. evaluates the condition
         *      if true, it executes the body of the loop again
         *      if false, continues execution after the loop
         */ 
        int count = 1;   // initialization
        do
        {
            System.out.println(count); //body
            count++;  //update the loop variable
        }
        while(count <= 5);          // condition
        System.out.print("done"); 
    }
}
