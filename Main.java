package conversion;


public class Main {
	public static void main(String[] args)
	{
		
		//UserEvents user = new UserEvents();
		Graphic graphic = new Graphic();
		Screen screen = new Screen(graphic);
		//screen.menuScreen();
		
		//graphic.removeInput();
		
		//a.printStuff(b);
	
		// a.removeInput(); this works
		graphic.printStuff(screen.menuStartScreen());
		graphic.addInput();
		while(graphic.getLength() == 0)
		{
			//graphic.refresh();
		}
		//graphic.refresh();
		//graphic.clearStuff();
		//graphic.printStuff("meme"); this works
	
		graphic.printStuff(screen.showInput(graphic.getInput()));
		//graphic.refresh();
	}
	
	
}
