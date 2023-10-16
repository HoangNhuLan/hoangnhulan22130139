package Lab4_Algorithms_2;

import java.util.Arrays;

public class SelectionSort {
	public static void swap(int[] array, int a , int b) {
		int swap;
		swap= array[a];
		array[a]= array[b];
		array[b]= swap;
		
	}
	public static void selectionSort(int[] array) {
		for(int i=0; i< array.length-1; i++) {
			int minIndex= i;
			for(int j= i+1; j< array.length; j++ ) {
				if(array[minIndex] > array[j]) {
					minIndex=j;
				}
			}
			swap(array, i, minIndex);
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {4,7,-6,0,1,5};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	

}
