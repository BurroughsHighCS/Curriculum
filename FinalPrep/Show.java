public class Show {
	private int[][] seats;

	public Show() {
		seats = new {
			{0,1,1,0,0,0},
			{0,0,0,0,1,1},
			{1,0,0,1,0,0}
		}
	}

	public boolean isAisleSeat(int row, int seatNumber) {
		/* Implemented in part (a) */
	}

	public boolean twoTogether() {
		/* Implemented in part (b) */
	}

	public int findAdjacent(int row, int seatsNeeded) {
		for (int c = 0; c <= SEATS_PER_ROW - seatsNeeded; c++)
		{
			boolean occupied = false;
			if (seats[row][c] ==0) //if first seat empty
			{
				for (int tester = 1; tester<seatsNeeded; tester++)
				{
					if seats[row][c+tester] == 1) {
						occupied = true;
					}
				}
				if(!occupied) {
					return c;
				}
			}
		}
		return -1;		
	}

}