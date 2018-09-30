// Overload

package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// Constructor Starndart
	public Product () {

	}

	// Constructor Méthod 
	public Product (String name, double price, int quantity) {
		this.name = name;   // This é a referência do atributo do objeto
		this.price = price; // This é a referência do atributo do objeto
		this.quantity = quantity; // This é a referência do atributo do objeto
		
	}

	// Constructor Personal
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	
	
	public double totalValueInStock() {
		return price * quantity;

	}

	public void addProducts(int quantity) {
		this.quantity += quantity;

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;

	}

	public String toString() {
		return name

				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());

	}
}