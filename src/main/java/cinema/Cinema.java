package cinema;

import java.util.HashMap;

public class Cinema {
	Seat[][] seats;
	RoomSize roomsize;
	static Integer locknumber = 0;
	static HashMap<String, Seat> locks = new HashMap<>();
	Integer lock = 0;
	
	public void initRoom(int row, int column) {
		if (row <= 0 || column <= 0) {
			
		}
		this.roomsize.setRow(row);
		this.roomsize.setColumn(column);
		this.seats = new Seat[row][column];
		for (int i = 0; i < column; i++) {
			for (int j = 0; i < row; j++) {
				seats[i][j].setRow(row);
				seats[i][j].setColumn(column);
				seats[i][j].setSeatStatus(SeatStatus.FREE);
			}
		}
	}
	
	public RoomSize getRoomSize() {
		return this.roomsize;
	}
	
	public Seat getSeat(Seat seat) {
		return this.seats[seat.getColumn()-1][seat.getRow()-1];
	}
	
	public synchronized String reserve(Seat seat) {
		lock++;
		locks.put("lock"+lock.toString(), seat);
		seats[seat.getColumn()-1][seat.getRow()-1].setSeatStatus(SeatStatus.LOCKED);
		return "lock"+lock.toString();
	}
	
	public synchronized Seat unreserve(String lockid) {
		locks.get(lockid).setSeatStatus(SeatStatus.FREE);
		return locks.get(lockid);
	}
	
	public synchronized Seat lock(String lockid) {
		locks.get(lockid).setSeatStatus(SeatStatus.LOCKED);
		return locks.get(lockid);
	}
	
	public Seat[][] getseats(){
		return seats;
	}
	
}
