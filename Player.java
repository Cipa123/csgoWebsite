
public class Player {

	private int Lucidity = 1;
	private int Sanity = 1;
	private boolean Awake = false;


	public Player(int Lucidity, int Panic, boolean Awake) {
		Lucidity = this.getLucidity();
		setSanity(this.getSanity());
		Awake = this.isAwake();
	
		
		
	}


	public boolean isAwake() {
		return Awake;
	}


	public void setAwake(boolean awake) {
		Awake = awake;
	}


	public int getLucidity() {
		return Lucidity;
	}


	public void setLucidity(int lucidity) {
		Lucidity = lucidity;
	}


	public int getSanity() {
		return Sanity;
	}


	public void setSanity(int sanity) {
		Sanity = sanity;
	}
	
}
