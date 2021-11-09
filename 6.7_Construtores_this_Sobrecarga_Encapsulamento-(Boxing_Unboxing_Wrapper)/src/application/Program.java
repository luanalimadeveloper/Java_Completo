package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] room = new Room[9];
		int quantityRooms;
		String name;
		String email;
		int numberRoom;
		
		System.out.print("How many rooms will be rented? ");
		quantityRooms = sc.nextInt();
		
		for(int i = 0; i<quantityRooms; i++ ) {
			sc.nextLine();
			System.out.println("");
			System.out.printf("Rent # %d: \n", i+1);
			System.out.printf("Name: ");
			name = sc.nextLine();
			System.out.printf("Email: ");
			email = sc.nextLine();
			System.out.printf("Room: ");
			numberRoom = sc.nextInt();			
			
			room[numberRoom] = new Room(name, email, numberRoom);
		}
		
		System.out.println("");
		System.out.println("Busy rooms:");
		for(int j = 0; j < room.length; j++) {
			if (room[j] != null) {
				System.out.printf(" %d: %s, %s \n", j, room[j].getName(), room[j].getEmail());				
			}
		}
		
		sc.close();
	}
}
