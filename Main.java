package W_9_8_Hotelzimmerverwaltung;
/* Small program to administrate the rooms of a hotel.
 * Define amount and numbers of rooms first.
 * Check in or check out guests through corresponding methods
 */
public class Main {

	public static void main(String[] args) {
		
		// 1. Initialize object array of class room
		Room[] rooms = new Room[5];
		rooms[0] = new Room(100);
		rooms[1] = new Room(101);
		rooms[2] = new Room(102);
		rooms[3] = new Room(103);
		rooms[4] = new Room(104);
		
		// 2. Initialize new object of class Hotel 
		Hotel hotel = new Hotel("Hilton", rooms);
		System.out.println("Successfully checked in room: " + hotel.checkIn());
		System.out.println("Successfully checked in room: " + hotel.checkIn());
		System.out.println("Successfully checked in room: " + hotel.checkIn());
		System.out.println("Successfully checked in room: " + hotel.checkIn());
		System.out.println("Checked out room: " + hotel.checkOut(100));
		System.out.println("Checked out room: " + hotel.checkOut(101));
		System.out.println("Successfully checked in room: " + hotel.checkIn());
		
		// Check for available hotel rooms
		System.out.println();
		System.out.println("Please find overview of rooms' status below:");
		hotel.getRoomAvailability();
	}
}
