

import java.util.Scanner;


public class CoinflipClass {

	
	
	
	
	
	
	public static void main(String[] args) {
		
		int Balance = 100;
		
		System.out.println("Hello and welcome to Coinflip!");
		
		gamble(Balance);

	}

	
	public static void gamble(int Balance){
	
		
	Scanner sc = new Scanner(System.in);
	boolean Continue = true;
	
		while(Continue == true)
		{
			
			boolean ctside = false;
			boolean tside = false;
			boolean ctsidewin = false;
			boolean tsidewin = false;
			
			System.out.println("Your balance is currently:" + Balance + ("$"));
			System.out.println(" ");
			System.out.println("How much do you want to bet?");
			int BetAmount = sc.nextInt();
			
			Balance = Balance - BetAmount;
			
			System.out.println("New Balance = " + Balance + ("$"));
			
			if ((BetAmount > Balance + BetAmount)||(BetAmount < 0))
			{
				System.out.println("Illigal Bet Exiting Game...");
				Continue = false;
				break;
			}
			
			
			
			System.out.println("Choose a side, CT or T?");
			
			sc.nextLine();
			
			String Side = sc.nextLine();
			
			if (Side.equals("T"))
			{
				tside = true;
				System.out.println("You are Terrorist");
			}
			
			else if (Side.equals("CT"))
					{
				ctside = true;
				System.out.println("You are Counter-Terrorist");
					}
			else 
			{

				tside = false;
				ctside = false;
			}
		
			
			
			System.out.println("Someone has joined on the coinflip");
			
			System.out.println("filpping coin..");
			
			int LuckyNumber =(int)(Math.random()*10);
			
			
			
			
			if (LuckyNumber <= 4)
			{
				tsidewin = true;
			}
			else if (LuckyNumber >= 4)
			{
				ctsidewin = true;
			}
			
			
			
			
			
			
			if ((tside == true)& (tsidewin == true))
			{
				Balance = BetAmount*2 + Balance;
				System.out.println(" ");
				System.out.println("YOU WIN!");
			}
			else if ((ctside == true)&(ctsidewin == true))
			{
				Balance = BetAmount*2 + Balance;
				System.out.println(" ");
				System.out.println("YOU WIN!");
			}
			else
			{
				System.out.println("Sorry you lost the flip");
			}
			
			
			System.out.println("Your balance currently = " + Balance + ("$"));
			System.out.println("Thanks for playing!");
			System.out.println(" ");
			System.out.println("enter 'yes' to play again");
			System.out.println("or 'no' to quit");
			String PlayAgain = sc.nextLine();
			if (PlayAgain.equals ("yes"))
			{
				 Continue = true;
			}
			else if (PlayAgain.equals ("no"))
			{
				Continue = false;
			}
		}
			
		
	}
}
