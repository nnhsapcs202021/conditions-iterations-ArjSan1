import java.util.Scanner;

/**
 * Write a description of class Year here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Year
{
    public static void isLeapYear()
    {
   
   
      Scanner in = new Scanner(System.in);
      System.out.print("Input a year: ");
      int year = in.nextInt();
      
      if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
      {
          System.out.println("The year you inputted is a leap year!");
        }
        else
        {
            System.out.println("The year you inputted is not a leap year");
        }
    }
        // put your code here
       
    }

