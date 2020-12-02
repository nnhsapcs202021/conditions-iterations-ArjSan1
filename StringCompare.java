
/**
 * Write a description of class StringCompare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringCompare
{

    
    public StringCompare()
    {
        String word1 = "catalog";
        String word2 = "cat";
        int result1 = word1.compareTo("aaa");
        int result2 = word1.compareTo(word2);
        
        String prefix1 = word1.substring(0, 3);
        String prefix2 = word1.substring(0, 3);
      
        if(result1 > 0)
        {
            System.out.println("condition #1 is true");
        }

        if(result2 == 0)
        {
            System.out.println("condition #2 is true");

        }
        else if (result2 < 0)
        {
          System.out.println("condition #3 is true");
 
        }
        
        if (prefix1.equals(prefix2))
        {
          System.out.println("condition #4 is true");

        }
    }
}
