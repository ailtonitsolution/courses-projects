/*
 * Section 5, class 63 - Vecton recive object
*/

package application;
import java.util.Locale;
import java.util.Scanner;
import entities.ProductAula63;
	
public class Aula63 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ProductAula63[] vect = new ProductAula63[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductAula63(name, price);

		}
		
		double sum = 0.0;
		for (int i = 0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum /vect.length;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();
		
	}

}
