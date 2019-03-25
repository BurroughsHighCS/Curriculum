package structures;
import java.util.List;
import java.util.ArrayList;

public class Tournament {
	private Player[] slots;
	private List<String> waitingList;

	public Tournament() {
		//init player array and waiting list
	}

	public Player requestSlot(String playerName) {
		//implement the request slot function
	}

	public Player cancelAndReassignSlot(Player p) {
		//implement the cancelAndReassignSlot function
	}

	@Override
	public String toString() {
		//return a string representation of all data in the Tournament
	}
}