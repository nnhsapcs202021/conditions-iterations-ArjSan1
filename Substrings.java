import java.util.Scanner;
/**
 * Write a description of class Substrings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Substrings
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();

        for (int length = 1; length <= word.length(); length++)
        {

            for (int p = 0; p <= word.length() - length; p++)
            {
                System.out.println(word.substring(p, p + length));
            }
        }
    }
}
