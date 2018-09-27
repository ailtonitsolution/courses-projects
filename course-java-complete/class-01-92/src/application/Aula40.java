package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Aula40 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();	
		System.out.println("Enter produ sobrct data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product.name + "," + product.price + "," + product.quantity);

		sc.close();	
	}

}