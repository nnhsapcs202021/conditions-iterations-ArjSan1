import java.util.Scanner;
/**
 * Write a description of class RockPaperScissors here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase(); 
        /*
        if(player1.equals("rock"))
        { if (player2.equals("scissors"))
            {
                System.out.println("Player one wins!"); 
            }
            else if (player2.equals("paper"))
            {
                System.out.println("Player two wins!"); 
            }
            else if (player2.equals("rock"))
            {
                System.out.println("The game is tied!"); 
            }
        }
        if(player1.equals("scissors"))
        {   
            if (player2.equals("scissors"))
            {
                System.out.println("The game is tied!"); 
            }
            else if (player2.equals("paper"))
            {
                System.out.println("Player one wins!"); 
            }
            else if (player2.equals("rock"))
            {
                System.out.println("Player two wins!"); 
            }
            
        }
        if(player1.equals("paper"))
        {
         if (player2.equals("scissors"))
            {
                System.out.println("Player two wins!"); 
            }
            else if (player2.equals("paper"))
            {
                System.out.println("The game is tied"); 
            }
            else if (player2.equals("rock"))
            {
                System.out.println("Player one wins!"); 
            }
        }
    }   */
    if (player1.equals(player2))
    {
         System.out.println("The game is tied"); 
    }
    else if (player1.equals("rock") && player2.equals("scissors") || player1.equals("paper") && player2.equals("rock") || player1.equals("scissors") && player2.equals("paper"))
    
    {
        System.out.println("Player one wins!"); 
    }
    else 
    {
        System.out.println("Player two wins!");
    }
}
}