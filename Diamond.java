import java.util.Scanner;

/**
 * Write a description of class Diamond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Diamond
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int l = 1;
        for(int i=1; i <= n; i++){
            for(int j=1; j<= l; j++){
                System.out.print("*");
            }
            System.out.println();
            l = l + 2;
        }
        l = l - 4;
        for(int i=1; i < n; i++){
            for(int j=1; j <= l; j++){
                System.out.print("*");
            }
            System.out.println();
            l = l-2;
        }
    }
}