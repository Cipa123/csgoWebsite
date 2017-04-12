package GameState;

import java.awt.*;
import TileMap.Background;


public class MenuState extends GameState {
	
	private Background bg;
	
	
	private int currentChoice = 0;
	private String[] options = {
			"Start",
			"Help",
			"Quit"
			};
	
	private Color titleColor;
	private Font titleFont;
	
private Font font;
	
	
	
	
	public MenuState(GameStateManager gsm) {
		
		this.gsm = gsm;
		
		try{
			
			bg = new Background("/Background/menug.gif", 1);
			bg.setVector(-0.1, 0);
			
			titleColor = new Color(128, 0, 0);
			titleFont = new Font ("Century Gothic", Font.PLAIN, 28);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public void init() {}
	public void update() {}
	public void draw(Graphics2D g) {}
	public void keyPressed(int k) {}
	public void keyReleased(int k) {}
}


