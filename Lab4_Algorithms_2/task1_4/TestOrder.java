package task1_4;

import java.util.Arrays;

public class TestOrder {
	public static void main(String[] args) {

		Product p1 = new Product("01", "nuoc ep", 25000, "drink");
		Product p2 = new Product("02", "cocacola", 10000, "drink");
		Product p3 = new Product("03", "ca rot", 3000, "vegetable");
		Product p4 = new Product("04", "thit ga", 280000, "food");
		Product p5 = new Product("05", "rau muong", 7000, "vegetable");
		
		OrderItem it1 = new OrderItem(p1,1);
		OrderItem it2 = new OrderItem(p2,3);
		OrderItem it3 = new OrderItem(p3,3);
		OrderItem it4 = new OrderItem(p4,2);
		OrderItem it5 = new OrderItem(p5,1);
		OrderItem[] orderItems = {it1, it2, it3, it4, it5};
		Order order = new Order(orderItems);

		System.out.println("Unsorted array");
		System.out.println(Arrays.toString(orderItems));
		System.out.println();
		
		order.selectionSort(orderItems);
		System.out.println("Array is sorted by selection");
		System.out.println(Arrays.toString(orderItems));
		System.out.println();
		
		order.bubbleSort(orderItems);
		System.out.println("Array is sorted by bubble ");
		System.out.println(Arrays.toString(orderItems));
		System.out.println();
		
		
		order.insertionSort(orderItems);
		System.out.println("Array is sorted by insert");
		System.out.println(Arrays.toString(orderItems));
		System.out.println();
		
		
		
	}
}