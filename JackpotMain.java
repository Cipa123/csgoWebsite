import java.util.Scanner;

public class JackpotMain
{
   public static void main(String[] args)
   {
      int numPlayers = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of players");
      numPlayers = sc.nextInt();
      
      int [] bets = new int [numPlayers];
            for(int i = 0; i < bets.length; i++)
             {
                System.out.println("Enter amount for player " + i);
                bets[i] = sc.nextInt();
       
        
            }
            
            int sum = 0;
         
            for(int i =0; i<bets.length; i++)
            {
               sum += bets[i];
               
               
               
            }
            System.out.println(sum);
      double [] playerOdds = new double [numPlayers];
            for(int i =0; i<playerOdds.length; i++)
            {
               playerOdds[i] = sum/bets[i]; 
            }
   
            System.out.println("done");
            for(int i =0; i<playerOdds.length; i++)
            {
               System.out.println(playerOdds[i]);
                
            }
   
   
   
   
   
   }
}
