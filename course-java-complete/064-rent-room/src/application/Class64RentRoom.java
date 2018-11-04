/*
* This exercise Section 5, class 64
*/

package application;

import java.util.Scanner;
import entities.Room;

public class Class64RentRoom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Room[] vect = new Room[10];

		System.out.print("How many rooms will be rented ? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n ; i++) {
			System.out.println();
			System.out.println("Rent #:"+(i+1));
			//sc.nextLine();

			System.out.print("Name: ");
			sc.nextLine();
			String name  = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Room(name, email);
			
			/*
			for(int x = 0; x < vect.length ; x++) {
				if(x == room && vect[x] == null) {
					vect[x] = new RoomAula64(name, email);
					
				}
				
			} */

			
		}

		System.out.println("");
		System.out.println("Busy rooms: ");
		for(int i = 0 ; i < vect.length ; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);

			}

		}
		
		sc.close();

	}
	
}
