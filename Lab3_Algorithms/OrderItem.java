package Lab3_Algorithms;

public class OrderItem implements Comparable<OrderItem> {
	private Product p;
	private int quality;
	/**
	 * @param p
	 * @param quality
	 */
	public OrderItem(Product p, int quality) {
		this.p = p;
		this.quality = quality;
	}
	public int compareTo(OrderItem o) {
		return p.compareTo(o.p);
	}
	public double getPrice() {
		return p.getPrice();
	}
	public Product getProduct() {
		return p;
	}
	public String getType() {
		return p.toString()+ ": " + quality+"\n";
	}

}
