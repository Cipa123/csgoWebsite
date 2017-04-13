public class Level extends GameTile  {
	private GameTile[][] level = new GameTile[600][360];
	
	Level(GameTile a, int x, int y)	 
	{
		level[x][y] = a;
	}
	public void setLevelTile(GameTile a, int x, int y)
	{
		level[x][y] = a;
	}
	public GameTile getLevelTile(int x , int y)
	{
		return level[x][y];
	}
}
