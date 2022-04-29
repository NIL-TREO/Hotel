package Hotel;

public class Hotel {
	private Room[] rooms;
	private String hotelName;

	public Hotel(String name, Room[] rooms) {
		this.rooms = rooms;
		this.hotelName = name;
	}

	// Browse through array of hotel rooms and check for vacant rooms.
	// If vacant set status of availabilty to false and return room number.
	public int checkIn() {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i].isAvailable() == true) {
				rooms[i].setAvailable(false);
				return rooms[i].getNumber();
			}
		}
		return 0;
	}

	// set status of hotel room availability to true and return room number
	public int checkOut(int number) {
		for (int j = 0; j < rooms.length; j++) {
			if (rooms[j].getNumber() == number && !rooms[j].isAvailable()) {
				rooms[j].setAvailable(true);
				return rooms[j].getNumber();
			}
		}
		return 0;
	}
	
	
	// return current availability status of each hotel room
	public void getRoomAvailability() {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i].isAvailable()) {
				System.out.println("Room " + (rooms[i].getNumber()) + " is available");
			} else {
				System.out.println("Room " + rooms[i].getNumber() + " is not available");
			}
		}
	}

}
