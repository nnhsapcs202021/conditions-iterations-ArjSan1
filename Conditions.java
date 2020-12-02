import java.util.Scanner;

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

    /*
     * == returns true if the strings contain the same value
     *  For variables of a class type, including string, this means they contain the same reference.
     *  They refer to the same object in memory, not that the two strings have the same sequence
     *  of characters. 
     */
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        if (str1 == str2)
        {
            System.out.println("Strings refs are equal");

        }
        else
        {
            System.out.println("strings refs are not equal");
        }
        /*
         * The equals method returns tru if the two objects referenced by the varuibles are "equal"
         * What equals means is defined by the class. For strings it means that the two objects have the same
         *  sequence of characters
         */

        if (str1.equals(str2))
        {
            System.out.println("Strings are equal");

        }
        else
        {
            System.out.println("strings are not equal");
        }
        /*
         * We will determine which string comes first lexicographically using the compareTo
         * method of the string class. 
         * 
         * compareTo returns an int:
         *      0: if the strings are equal (same sequence of characters)
         *      < 0: if str1 < str2 lexicographically
         *      > 0: if str1 > str2 lexicographically
         */
        int result = str1.compareTo(str2);
        String firstString = null;

        if(result < 0)
        {
            firstString = str1;
        }
        else if (result > 0)
        {
            firstString = str2;
        }
        if (firstString != null)
        {
            System.out.println("The first string is: " + firstString);
            System.out.println("Its length is: " + firstString.length());
        }
        else
        {
            System.out.println("Strings are equal");

        }
        
        /* This is an example of a "short circuit".
         * 
         * For an AND operation, if the left operand is false, the right operand will not be evaluated
         *  because the AND operation is false regardless.
         *  
         *  This may result in a bug. If the first word is kiwi we will never read the second word
         *  from the stream, which may result in unexpected behavior.
         */
       
        if(firstString != null && firstString.length() > 3)
        {
            System.out.println("The first string has more than 3 characters.");
        }
        /*
         * This is another "short circuit" example
         * 
         * For an OR operation, if the left operand is true, the right operand is not evaluated
         *  because the OR operation is true regardless. 
         */
        System.out.print("Enter your two favorite fruits: ");
        if(s.next().equals("kiwi") || s.next().equals("kiwi"))
        {
            System.out.println("Kiwi is one of my favorites too!");
        }
        System.out.print("Enter your favorite ice cream flavor: ");
        String flavor = s.next();
        System.out.println("Your favorite ice cream flavor is: " + flavor);
    }
    public static void extraOperatorsExample()
    {
        /*
         * Augmenteed assignment operators +=, -=, *=, /=, %=
         */
        int x = 7;
        int y = 7;
        int z = 7;
        x = x+1;
        y += 1;
        z++;
        
        System.out.println(x+y+z);
        /*
         * post incremen/decrement operators (++/--)
         * returns the value before performing the increment/decrement
         */
        int a = 7;
        int b = a++;
        //a++;
        System.out.println(a + b);
        a--; //decrement as well
        --a; // preincrement operator
    }
}
