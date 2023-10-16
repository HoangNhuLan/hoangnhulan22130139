package Lab4_Algorithms_2;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int[] array) {
		int current ;
		for(int i =1; i< array.length;i++) {
			current = array[i];
			int j = i-1;
			while(j>=0 && array[j] > current) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1]= current;
		}
		
		
	}
	public static void main(String[] args) {
		int[] arr = {8,2,1,5,-4,2};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
