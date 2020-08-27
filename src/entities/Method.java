package entities;

public class Method {

	private String name;
	private double price;
	private int qtd;
	public double buy;
	private double sold;
	public Method(String name, double price, int qtd) {

		this.name = name;
		this.price = price;
		this.qtd = qtd;
		
	}
	
	public double setBuy(double sold) {
		return  setSold() * setAmount();
	}
	
	
	public double setSold() {
		return qtd -sold;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtd() {
		return qtd;
	}

	public double setAmount() {
		return price * qtd;
	}

	


	
	public String toString() {
		return "Product: " 
				+ name.toUpperCase() 
				+ "  Stock: " 
				+ qtd + "  Amount: " 
				+ String.format("%.2f", setAmount());

	}

}
