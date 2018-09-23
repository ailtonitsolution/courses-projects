package util;
public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	
	}
}


/* Meu exercício
package util;

public class CurrencyConverter {
	
	public double calculate;
	public double price;
	public double quantity;
	public double IOF;
	
	public double Calcula () {
		calculate = price * quantity;
		calculate *= IOF;
		
		return calculate;
		
	} 
	
}
*/