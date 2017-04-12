package Main;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;

public class GamePanel extends JPanel implements Runnable, KeyListener {
  
  // dimensions of the window
  public static final int WIDTH = 320;
  public static final int HEIGHT = 240;
  public static final int SCALE = 2;
  
  //games's thread
  //Thread = A thread is a single sequential flow of control within a program.
  
  private Thread thread;
  private boolean running;
  private int FPS = 60;
  private long targetTime = 1000 / FPS;
  
  // image
  /* image =
  The BufferedImage class is a cornerstone of the Java 2D immediate-mode imaging API. 
  It manages the image in memory and provides methods for storing, interpreting, and obtaining pixel data. ... 
  A BufferedImage has a ColorModel and a Raster of image data
  */
  private BufferedImage image;
  private Graphics2D g;
  
  public GamePanel() {
    super();
    setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
    setFocusable(true);
    requestFocus();
  }
  
  public void addNotify() {
    super.addNotify();
    if(thread == null) 
    {
      thread = new Thread (this);
      addKeyListener(this);
      thread.start();
    }
  }
  
  //initiates game with new image parameters
  
  private void init () {
    
    image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    g = (Graphics2D) g;
    running = true;
    
      
      
    }
    
  
  
  //runs init method and the Game loop
  public void run() {
    init();
    
    //game loop
    while (running) {
      update();
      draw();
      drawToScreen();
    }
      
  }
  
  private void update() {}
  private void draw() {}
  private void drawToScreen() {
    Graphics g2 = getGraphics();
    g2.drawImage(image, 0, 0, null);
    g2.dispose();
    
  }
  

  
  //all events that the computer interprets from the keyboard
  public void keyTyped(KeyEvent key) {}
  public void keyPressed(KeyEvent key) {}
  public void keyReleased(KeyEvent key) {}
  
}
