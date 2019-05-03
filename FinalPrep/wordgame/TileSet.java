public class TileSet {
	private List<Tile> tiles;

	private int unusedSize;

	public boolean allUsed() {
		return unusedSize == 0;
	}

	public int getUnusedSize() {
		return unusizedSize;
	}

	/** Shuffles the tiles in the tile set, and
	 *	resets unusedSize to the total number of tiles in the set.
	 */
	public void shuffle() {
		for(int k = tiles.size() - 1; k >= 1; k--) { //+1
			int r = (int) Math.random(k + 1);
			Tile temp = tiles.get(r); //+1
			tiles.set(r, tiles.get(k));
			tiles.set(k, temp); //swap 
		}

		unusedSize = tiles.size();
	}

	public Tile getNewTile() {
		/* def not show */
	}
}
