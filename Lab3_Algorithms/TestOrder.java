package Lab3_Algorithms;

import java.util.Arrays;

public class TestOrder {
	public static void main(String[] args) {
		Product p1 = new Product("01", "nuoc ep", 25000, "drink");
		Product p2 = new Product("02", "cocacola", 10000, "drink");
		Product p3 = new Product("03", "ca rot", 3000, "vegetable");
		Product p4 = new Product("04", "thit ga", 280000, "food");
		Product p5 = new Product("05", "rau muong", 7000, "vegetable");
		
		OrderItem it1 = new OrderItem(p1,8);
		OrderItem it2 = new OrderItem(p2,10);
		OrderItem it3 = new OrderItem(p3,3);
		OrderItem it4 = new OrderItem(p4,7);
		OrderItem it5 = new OrderItem(p5,7);
		OrderItem[] items = {it1, it2, it3, it4, it5};
		
		Arrays.sort(items);
		System.out.println(Arrays.toString(items));
		
		OrderItem[] listItem = {it1, it2, it3, it4, it5};
		Order order = new Order(listItem);
		
		System.out.println(order.cost());
		System.out.println(order.contains(p1));
		System.out.println(order.contains(p5));
		System.out.println(Arrays.toString(order.filter("drink")));
	}

}
