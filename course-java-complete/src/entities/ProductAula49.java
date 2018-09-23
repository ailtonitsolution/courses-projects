package entities;

public class ProductAula49 {
	public String name;
	public double price;
	public int quantity;
	
	// Contructor Méthod 
	public ProductAula49 (String name, double price, int quantity) {
		this.name = name;   // This é a referência do atributo do objeto
		this.price = price; // This é a referência do atributo do objeto
		this.quantity = quantity; // This é a referência do atributo do objeto
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