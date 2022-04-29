package Hotel;

public class Room {
	private int roomNumber;
	private boolean available;

	public Room(int number) {
		this.roomNumber = number;
		this.available = true;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isAvailable() {
		return this.available;
	}

	public int getNumber() {
		return this.roomNumber;
	}
}
