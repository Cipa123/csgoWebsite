public class GameTile
{
  private Object[] tile = new Object[2];
  GameTile(Object a, Object b)
  {
	tile[0] = a;
	tile[1] = b;
  }
  GameTile()
  {
	  
  }
  public Object[] getTile() 
  {
	  return tile;
  }
  public void setPlayerTile(PlayerObj b) 
	{
		tile[0] = b;
	}
  public void setTile(Tile b) 
	{
		tile[1] = b;
	}
}
