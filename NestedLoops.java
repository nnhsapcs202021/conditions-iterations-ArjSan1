
/**
 * Write a description of class NestedLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoops
{
    public static void NestedLoops()
    {
        for(int i =1; i <= 2; i++)
        {
            for (int j =1; j<=4; j++)
            {System.out.println(i + " " + j);
            }

        }
    }

    
    public static void NestedLoops2()
    {
        int i = 0;
        while(i < 2)
        {
            i++;

            int j =0;
            while(j<4)
            {
                j++;
                System.out.println(i + " " + j);

            }

        
        }
    }
    
        public static void NestedLoops3()
        {
            int i = 0;
            
            do
            {
                i++;
                int j = 0;
                do
                {
                j++;
                System.out.println(i + " " + j);

                }
                while(j<4);
            }
            while(i < 2);
        }

}
