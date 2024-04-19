package cinema;

public class Seat {
	int row, column;
	SeatStatus seatstatus;
	
	public int getRow() {
		return this.row;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	public SeatStatus getSeatStatus() {
		return this.seatstatus;
	}
	
	public void setSeatStatus(SeatStatus seatstatus) {
		this.seatstatus = seatstatus;
	}
}
