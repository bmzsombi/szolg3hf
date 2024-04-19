package cinema;

import java.util.ArrayList;

public class Cinema {
	Seat[][] seats;
	int row, column;
	Integer locknumber = 0;
	ArrayList<Integer> locks = new ArrayList<>();
	
	public void initRoom(int row, int column) {
		if (row <= 0 || column <= 0) {
			
		}
		this.row = row;
		this.column = column;
		this.seats = new Seat[row][column];
	}
	
	
}
