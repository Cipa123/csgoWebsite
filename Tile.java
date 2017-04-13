public class Tile {
		private boolean isWalkable;
		private boolean isEmpty;
		Tile()
		{
			isWalkable = false;
			isEmpty = true;
		}
		public boolean checkWalkable()
		{
			return isWalkable;
		}
		public boolean checkIsEmpty()
		{
			return isEmpty;
		}
}		
