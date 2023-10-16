package Lab4_Algorithms_2;

import java.util.Arrays;

public class BubbleSort {
	public static void swap(int[] array, int a , int b) {
		int swap;
		swap= array[a];
		array[a]= array[b];
		array[b]= swap;
		
	}
	public static void bubbleSort(int[] array) {
		for(int i=0; i< array.length-1; i++) {
			for(int j=i+1; j<array.length;j++ ) {
				if(array[i] > array[j] ) {
					swap(array, i ,j);
					
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,4,-6,8,2};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
