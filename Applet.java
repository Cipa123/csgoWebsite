
import java.awt.Color;
import javax.swing.JApplet;
import java.awt.Graphics;


public class Applet extends JApplet {
   
    public void start(){
        
    }
    
    
    public void init () {
        
        setBackground(Color.pink);
        
    }
    
    
    public void paint (Graphics g){
        
        g.drawString("CSGO Gambling", 100, 90);
        g.drawRect(100, 200, 1000, 300);
        g.drawString("CSGO Gambling", 450, 220);
        
    }
    
    
    
}
