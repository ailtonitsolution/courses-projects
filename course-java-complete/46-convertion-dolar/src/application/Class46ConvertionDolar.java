package application;
import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Class46ConvertionDolar {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	System.out.print("What is the dollar price? ");
	double dollarPrice = sc.nextDouble();

	System.out.print("How many dollars will be bought? ");
	double amount = sc.nextDouble();
	double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
	
	System.out.printf("Amount to be paid in reais = %.2f%n", result);
	sc.close();
	}
}



/*


// Exercício
package Application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Aula46 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		CurrencyConverter conv = new CurrencyConverter();
		
		System.out.print("What is the dollar price ? ");
		conv.price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought ? ");
		conv.quantity = sc.nextDouble();
		
		conv.IOF = 1.06;
		
		System.out.printf("Amount to be paid in reais =   %.2f%n", conv.Calcula());
		
		sc.close();
	}	

}

*/