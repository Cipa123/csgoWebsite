import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


public class BareBonesKeyListener extends Applet implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Rectangle rect;
	private ArrayList<Integer> keysDown;
	
	public void init()
	{
		this.addKeyListener(this);
		keysDown = new ArrayList<Integer>();
	     rect = new Rectangle(0,0, 50,50);
	}
	public void paint(Graphics g)
	{
		setSize(500,500);
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(rect);
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(!keysDown.contains(e.getKeyCode()))
		{
			keysDown.add(new Integer(e.getKeyCode()));
		}
		moveRect();
	
		repaint();
	}
	public void moveRect()
	{
		int x = rect.x;
		int y = rect.y;
		
		if(keysDown.contains(new Integer(KeyEvent.VK_UP)))
			y -= 1;
	    if(keysDown.contains(new Integer(KeyEvent.VK_DOWN)))
			y += 1;
	    if(keysDown.contains(new Integer(KeyEvent.VK_RIGHT)))
			x += 1;
	    if(keysDown.contains(new Integer(KeyEvent.VK_LEFT)))
			x -= 1;
	    rect.setLocation(x,y);
	}
	@Override
	public void keyReleased(KeyEvent e) {
	keysDown.remove(new Integer (e.getKeyCode()));
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
