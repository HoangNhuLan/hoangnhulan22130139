package Lab3_Algorithms;

import java.util.Arrays;

public class Order {
	private OrderItem[] item;
	
	public Order(OrderItem[] item) {
		this.item = item;
	}
	public double cost() {
		double result =0;
		for (int i =0; i< item.length; i++) {
			result += item[i].getPrice();
		}
		return result;
	}
	public boolean contains(Product p) {
		Arrays.sort(this.item);
		int low =0;
		int high = item.length-1;
		while(low <= high) {
			int mid = (low+high)/2;
			if(p.compareTo(item[mid].getProduct()) ==0){
				return true;
			}
			if(p.compareTo(item[mid].getProduct()) < 0) high =mid-1;
			else low = mid +1;
		}
		return false;
	}
	public Product[] filter(String type) {
		int count = 0;
		for (int i = 0; i < item.length; i++) {
			if(item[i].getType().equals(type)) count++;
		}
		Product[] result = new Product[count];
		for (int i = 0; i < item.length; i++) {
			if(item[i].getType().equals(type)) {
				result[--count] = item[i].getProduct();
			}
		}
		return result;
	}

}
