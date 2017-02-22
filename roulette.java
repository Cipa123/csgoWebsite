import java.util.Scanner; // this imports scanner class, which can use .nextInt or .nextLine
/**
 * Write a description of class csgoBaseGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class roulette
{
    public static void main(String[] args)
    {
        int balance = 100;
        Scanner sc = new Scanner(System.in); // this is declaration to make scanner
        String a = "yes";
        while(a.equals("yes"))
        {
          gamble();
          System.out.println("Enter yes to continue");
          a = sc.nextWord();
        
        
        
        
        
        
        }
    }
    public static void gamble()
    {
        
        // how to make randome int, (int)(Math.random()*OneBelowMaxInt i.e 10 would result highest number of 9) + Starting int
        //(int)(Math.random()*11)+1 would return an int between 1 and 11
        // if ((int)(Math.random()*11)+1 == 2)// one in 11 chance  
           { 
            do something
            }
        
    }
}
