package TileMap;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

import Main.GamePanel;


public class TileMap {

	//postition
	
	private double x;
	private double y;
	
	
	//bounds
	
	private int xmin;
	private int ymin;
	private int xmax;
	private int ymax;
	
	private double tween;
	
	// map
	
	private int [][] map;
	private int tileSize;
	private int numRows;
	private int numCols;
	private int width;
	private int height;
	
	//tile set
	
	private BufferedImage tileset;
	private int numTilesAcross;
	private Tile[][] tiles;
	
	//drawing set bounds for the how many tiles processed
	
	private int rowOffset;
	private int colOffset;
	
	//Rows and Columns Cols for short
	
	private int numRowsToDraw;
	private int numColsToDraw;
	
	public TileMap(int tileSize) {
		
		this.tileSize = tileSize;
		
		//tile "tileSize + 2;" padding
		numRowsToDraw = GamePanel.HEIGHT / tileSize + 2;
		numColsToDraw = GamePanel.WIDTH / tileSize + 2;
		//twitching thing
		tween = 0.07;
		
		
		
		
	}
	
	//loads tiles into memory
	public void loadTiles (String s) {
		
		try {
			
			tileset = ImageIO.read(getClass().getResourceAsStream(s));
			numTilesAcross = tileset.getTileWidth() / tileSize;
			tiles = new Tile [2][numTilesAcross];
			
			BufferedImage subimage;
			//column
			for(int col = 0; col < numTilesAcross; col = col + 1) {
				
				//returns a buffered image defined by a rectangular region
				//basically it gets a part of an already existing image and defines what that is
				//you need an image with different rows
				subimage = tileset.getSubimage(col * tileSize, 0, tileSize, tileSize);
				
				//row 1
				tiles[0][col] = new Tile(subimage, Tile.NORMAL);
				subimage = tileset.getSubimage(col * tileSize, tileSize, tileSize, tileSize);
				//row 2
				tiles[1][col] = new Tile(subimage, Tile.BLOCKED);
				
				
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	//loads map files to memory
	public void loadMap (String s) {
		
		//first line number of columns
		//second line number of rows
		//rest is map itself
		
		try {
			
			InputStream in = getClass().getResourceAsStream(s);
			BufferedReader br = new BufferedReader (new InputStreamReader(in));
			
			
			
			
		}
		catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	
	
}
