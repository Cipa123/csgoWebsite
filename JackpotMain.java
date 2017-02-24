import java.util.Scanner;

public class JackpotMain
{
   public static void main(String[] args)
   {
      int numPlayers = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number of players");
      numPlayers = sc.nextInt();
      
      double [] bets = new double [numPlayers];
            for(int i = 0; i < bets.length; i++)
             {
                System.out.println("Enter amount for player " + (1+i));
                bets[i] = sc.nextDouble();
       
        
            }
            
            double sum = 0;
         
            for(int i =0; i<bets.length; i++)
            {
               sum += bets[i];
               
               
               
            }
            System.out.println(sum);
      double [] playerOdds = new double [numPlayers];
            for(int i =0; i<playerOdds.length; i++)
            {
               playerOdds[i] = bets[i]/sum; 
            }
   
            System.out.println("done");
            for(int i =0; i<playerOdds.length; i++)
            {
               System.out.println(playerOdds[i]);
                
            }
   
            double luckyNumber =Math.random();
             double prevOdd = 0;
                    for(int i =0; i<bets.length; i++)
                    {
                  
                        if(luckynumber > prevOdd && luckyNumber <= (prevOdd + playerOdds[i]))
                        {
                                System.out.println("player " + (1+i) + " won " + sum);
                            i = bets.length;

                         }
                        prevOdd = prevOdd+playerOdds[i];







                      }


   
   }
}
