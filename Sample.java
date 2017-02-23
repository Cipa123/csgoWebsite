



import java.util.Scanner;
import java.util.*;

public class Sample{
	

	public static void main(String[] args){
		
		
		int balance = 100;
		

		
	System.out.println("Hello, and Welcome to Bet your life away.com");
	
	gamble(balance);
	} 
	public static void gamble(int Balance)
	{
	  String a = "yes";
           Scanner sc = new Scanner(System.in);
		  while(a.equals("yes"))
			  
		  {

				boolean Green = false;
				boolean Red = false;
				boolean Black = false;
	                        System.out.println("Your balance is currently:" + Balance + ("$"));
			  	System.out.println("How much do you want to bet?");
	
				int BetAmount = sc.nextInt();

				Balance = Balance - BetAmount;

				System.out.println("New Balance = " + Balance + ("$"));
				System.out.println("Now pick a color, Green, Red, or Black?");

				String PlayerColor = sc.next();

				 if(PlayerColor.equalsIgnoreCase("Red"))
				 {
					 Red = true;
				 }
				 else if(PlayerColor.equalsIgnoreCase("Green"))
				 {
					 Green = true; 
				 }
				 else
				 { 
					 Black = true;
				 }

				 System.out.println(PlayerColor);

				 int LuckyNumber = (int)(Math.random()*15);

				 if ((LuckyNumber == 0)&& (Green == true))
				 {
					 BetAmount = BetAmount*14;
					 Balance = Balance + BetAmount;
					 System.out.println("JACKPOT! YOU WIN!");
				 }
				 else if ((LuckyNumber < 8)&& (LuckyNumber != 0) && (Red == true))
				 {
					 BetAmount = BetAmount*2;
					 Balance = Balance + BetAmount;
					 System.out.println("JACKPOT! YOU WIN!");
				 } 
				 else if ((LuckyNumber > 8)&& (LuckyNumber != 0)&& (Black == true))
				 {
					 BetAmount = BetAmount*2;
					 Balance = Balance + BetAmount;
					 System.out.println("JACKPOT! YOU WIN!");
				 }
				 else 
				 {
					 System.out.println("Sorry you lose"); 
				 }
				 System.out.println("New Balance = " + Balance + ("$"));
				 System.out.println("Thanks for playing!");
				 System.out.println("This was the Lucky Number " + LuckyNumber);
				 System.out.println("Green = 0 Red = 1-7 Black = 8-14");
			         System.out.println("enter yes to play again");
			  	
			         a = sc.next();
		  }
	} 
}
