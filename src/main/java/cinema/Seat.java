package cinema;

public class Seat {
	RoomSize roomsize;
	SeatStatus seatstatus;
	
	public int getRow() {
		return this.roomsize.getRow();
	}
	
	public int getColumn() {
		return this.roomsize.getColumn();
	}
	
	public void setRow(int row) {
		this.roomsize.setRow(row);
	}
	
	public void setColumn(int column) {
		this.roomsize.setColumn(column);
	}
	
	public SeatStatus getSeatStatus() {
		return this.seatstatus;
	}
	
	public void setSeatStatus(SeatStatus seatstatus) {
		this.seatstatus = seatstatus;
	}
}
