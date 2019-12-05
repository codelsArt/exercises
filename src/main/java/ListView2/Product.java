package ListView2;

public class Product {
	
	private String name;
	private double purchasePrice;
	private double sellingPrice;
	private String description;
	
	public Product(String name, double purchasePrice, double sellingPrice, String description ) {
		this.name = name;
		this.purchasePrice = purchasePrice;
		this.sellingPrice = sellingPrice;
		this.description = description;
	}

	public String toString(){
		return name + " Preis(" + purchasePrice + ")";
	}
	
	public double getPurchasePrice() {
		return purchasePrice;
	}
	
	public double getSellingPrice() {
		return sellingPrice;
	}
	
	public String getDescription() {
		return description;
	}
	
}
