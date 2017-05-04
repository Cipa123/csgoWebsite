package conversion;

public class Screen  {
	private String b;
	  Graphic graphic;
	  
	public Screen(Graphic a)
	{
		b = "";
		graphic = a;
	}
	
	
	  public String menuStartScreen()
	 	{
	 		b +="<html>------------------------------------------------------<br>" +
	 				"Welcome to the Labratory of Hypnogogia!<br>" +
	 				"------------------------------------------------------<br>" +
	 				"I will need to ask you some questions before we begin our procedure<br>"+
	 				"You are cooking with your parents and a hot pipe breaks from the wall and swings into the direction of your mom.<br>"+
	 				"What do you do?<br>"+
	 				"------------------------------------------------------<br>"+
	 				"1 = Step in front of your mom and the hot pipe<br>"+
	 				"2 = Push your mom out of the way<br>"+
	 				"3 = Do Nothing<br>"+
	 				"------------------------------------------------------<br>";
	 		
	  	    return b;
	 	}
	  
	  public String showInput(String input)
	  {
		
		  graphic.clearStuff();
		 // graphic.refresh();
		  return b += "Input is " + input;
		  
	  }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
