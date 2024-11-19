package ro.emanuel.pojo;

public class Order {
	
	private int id;
	private String date;
	private int idProduct;
	
	public Order(int id, String date, int idProduct) {
		this.id = id;
		this.date = date;
		this.idProduct = idProduct;
	}
	
	public Order(String date, int idProduct) {
		this.date = date;
		this.idProduct = idProduct;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		return date;
	}

	public int getIdProduct() {
		return idProduct;
	}

}