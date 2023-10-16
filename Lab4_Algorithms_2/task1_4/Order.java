package task1_4;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		this.items = items;
	}

	public static void swap(OrderItem[] orderItem, int a, int b) {
		OrderItem swap;
		swap = orderItem[a];
		orderItem[a] = orderItem[b];
		orderItem[b] = swap;

	}

	public static void selectionSort(OrderItem[] orderItem) {
		for (int i = 0; i < orderItem.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < orderItem.length; j++) {
				if (orderItem[minIndex].getP().getPrice() > orderItem[j].getP().getPrice()) {
					minIndex = j;
				}
			}
			swap(orderItem, i, minIndex);

		}
	}

	// sort theo ID, nếu trùng ID thì theo Name
	public static void bubbleSort(OrderItem[] orderItem) {
		for (int i = 0; i < orderItem.length - 1; i++) {
			for (int j = i + 1; j < orderItem.length; j++) {
				int numId = orderItem[i].getP().getId().compareTo(orderItem[j].getP().getId());
				int numName = orderItem[i].getP().getName().compareTo(orderItem[j].getP().getName());
				if (numId > 0) {
					swap(orderItem, i, j);
				} else if (numId == 0 && numName > 0) {
					swap(orderItem, j, j);
				}
			}
		}

	}

	// Sort by Price
	public static void insertionSort(OrderItem[] orderItem) {
		for (int i = 1; i < orderItem.length; i++) {
			double value = orderItem[i].getP().getPrice();
			OrderItem key = orderItem[i];
			int j;
			for (j = i - 1; j >= 0 && orderItem[j].getP().getPrice() > value; j--) {
				orderItem[j + 1] = orderItem[j];
			}

			orderItem[j + 1] = key;
		}
	}

}

