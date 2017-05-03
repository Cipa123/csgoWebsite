


// import java.util.Random; useless crap, and random events should be done in seperate class and done with Math.random;
import java.util.Scanner; // will be made into userInput class.

// I know you are starting out but this is bad design. A main class is the central class that executes other methods. 
// you put all of printing and events in main. There should be method called firstScreen or menuScreen which is called in main.
// or better yet a class that contains all the screens or menus. 
// READ THIS https://www3.ntu.edu.sg/home/ehchua/programming/java/j4a_gui.html

public class HypnogogiaMain
{

	public static void main(String[] args)
	{
		
		
		//Game Operators
	
		Scanner sc = new Scanner(System.in);
		//Random rand = new Random(); garbage
		
		
		//Dream Things
		
		String[] dreamStates = {"Sleep Onset", "Sleep Paralysis", "Rapid Eye Movement", "Deep Sleep"}; // seperate class
		String[] entities = {"Mom", "Dad", "Brother", "Sister", "Best Friend"};	// seperate class
		String dreamStage = dreamStates[0];
		String dreamStageNarrator = ("You are now in the " + dreamStage + " stage");
		
		//Player Things
		
		
		boolean running = true;
		Player a = new Player(1, 1, false);
		
		
		GAME:
			while(running)
			{
				boolean answerQuestion;
				System.out.println("------------------------------------------------------");
				System.out.println("Welcome to the Labratory of Hypnogogia!");
				System.out.println("------------------------------------------------------");
				System.out.println("I will need to ask you some questions before we begin our procedure");
				System.out.println("You are cooking with your parents and a hot pipe breaks from the wall and swings into the direction of your mom.");
				System.out.println("What do you do?");
				System.out.println("------------------------------------------------------");
				System.out.println("1 = Step in front of your mom and the hot pipe");
				System.out.println("2 = Push your mom out of the way");
				System.out.println("3 = Do Nothing");
				System.out.println("------------------------------------------------------");
				int personalityReletives = sc.nextInt();
				
				if (personalityReletives < 1 || personalityReletives > 3)
				{
					answerQuestion = false;
					while (answerQuestion == false)
					{
						System.out.println("Sorry you did not answer that question correctly"); 
						System.out.println("What do you do?");
						System.out.println("------------------------------------------------------");
						System.out.println("1 = Step in front of your mom and the hot pipe");
						System.out.println("2 = Push your mom out of the way");
						System.out.println("3 = Do Nothing");
						System.out.println("------------------------------------------------------");
						personalityReletives = sc.nextInt();
						if (personalityReletives >= 1 && personalityReletives <= 3)
						{
							answerQuestion = true;
						}
						
					}
				}
				else
				{
					answerQuestion = true;
				}
				
				
				
				
				System.out.println("------------------------------------------------------");
				System.out.println("Desc: The scientests have left the room. You are sitting in a white room." +
						"You look around: You see the white bed you sit on" +
						"and you can see that there is a tray with a white pill placed upon it");
		
				System.out.println("Type: 1 = Fall Asleep  2 = Stay Awake  3 = Take Melatonin Pill  4 = Help");
				System.out.println("------------------------------------------------------");
				
				int choose = sc.nextInt();
				
				//sleep
				if (choose == 1)
				{
					DreamStage = DreamStates[0];
					a.setAwake(true);
					System.out.println(dreamStageNarrator);
					System.out.println("Lucidity " + a.getLucidity());
					System.out.println("Sanity " + a.getSanity());
				}
				if (choose == 2)
				{
					
				}
				if (choose == 3)
				{
					
				}
				if (choose == 4)
				{
					System.out.println("Fall Asleep-- You will fall asleep and dream");
					
					
				}
				
				break; // running = false is way better. break can be do funky stuff sometimes
				
				
			}
		
		
		
	}
	
	
	
}
