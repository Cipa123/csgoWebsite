
public class Player {

	private int lucidity;  // variables start wirth lower case , exampleVariableName; Uppercase is for Classes.
	private int sanity;
	private boolean awake;


	public Player(int a,int b, boolean c) {
	        // are you sober? Lucidity = this.getLucidity();  wtf is this shit. This is worse than spaghetti code
		lucidity = setLucidity(a);
		//  or
		sanity = b
		awake = c;
		
		
		
	}


	public boolean isAwake() 
	{
		return awake;
	}


	public void setAwake(boolean a) 
	{
		awake = a;
	}


	public int getLucidity()
	{
		return lucidity;
	}


	public void setLucidity(int a) 
	{
		lucidity = a;   // again can you user normal names Lucidity = lucidity;   
	}


	public int getSanity() 
	{
		return sanity;
	}


	public void setSanity(int a)
	{
		sanity = a;
	}
	
}
