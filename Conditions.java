
/**
 * Examples and notes on conditions (Chapter 5)
 *
 * @author ArjSan1
 * @version 20nov2020
 */
public class Conditions
{
    public static void ifExample()
    {
        // model a coin flip
        int coinFlip = (int)(Math.random()*2);
        
        
        /* Executed if the conditional expression is true
         * Conditional are true or false
         * Conditionals must go inside paranthesis
         * Statements are grouped by curly braces
         * No colon after statement
         * 
         */
        if (coinFlip ==1)
        {
            System.out.println("Coin is heads!");
        }
        
        /*
         * if-else statement
         *  The else block executes if the condition is false
         */
        if (coinFlip ==1)
        {
            System.out.println("Coin is heads!");
        }
        else 
        {
            System.out.println("Coin is tails!");
        }
        
        
        //model the roll of a 4 sided die [1-4]
        int dieRoll = (int)(Math.random()*4) +1;
        
        /*
         * if-else if-else statement
         *  In Java else if is used instead of elif in Python
         */
        if (dieRoll ==1)
        {
            System.out.println("rolled a one");
        }
        else if (dieRoll ==2)
        {
            System.out.println("rolled a two");
            
        }
        else if (dieRoll ==3)
        {
            System.out.println("rolled a three");
            
        }
        else 
        {
                        System.out.println("rolled a four");

        }
        
        if (coinFlip == 0)
            System.out.println("Coin is tails!");
            System.out.println("Better luck next time...");
    }
    public static boolean doublesAreEqual(double num1, double num2)
    {
    /*
     * if we use == it will only return true if all binary digits match, so use epsilon value
     */
    final double EPSILON = 1e-14;
       
    if (Math.abs(num1-num2) < EPSILON) // has to be true or false
    {
        return true;
    }
    else
    {
        return false;
    }
    // dont have to use an if statement
    //just reuturn the (Math.abs(num1-num2) < EPSILON
    
}
}
