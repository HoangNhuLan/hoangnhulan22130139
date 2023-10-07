package Lab3_Algorithms;

public class Product implements Comparable<Product> {
	private String id;
	private String name;
	private double price;
	private String type;
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param type
	 */
	public Product(String id, String name, double price, String type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	public int compareTo(Product o) {
		int byId = this.id.compareTo(o.id);
		if (byId == 0) {
			return Double.compare(this.price, o.price);
		}
		return byId;

	}
	public String toString() {
		return id+ " "+ name+" "+ price+" "+type;
	}

}
