package Lab4_Algorithms_2;

import java.util.Random;

public class QuickSort {
	public static void swap(int[] array, int i , int j) {
		int swap;
		swap= array[i];
		array[i]= array[j];
		array[j]= swap;
		
	}
	public static void quickSort (int [] array, int low, int high) {
		if (low < high) {
			int pivot = partition(array, low, high);
			quickSort(array, low, pivot-1);
			quickSort(array, pivot+1, high);
		}
		
	}

	public static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low-1;
		
		for( int j= low; j< high; j++) {
			if(array[j] < pivot) {
				i++;
				swap(array, i, j);
			}
				
		}
		swap(array, i+1, high);
		return i+1;
	}

	public static int getPivot_MedianOfThree(int[] array, int left, int right) {
		 int center = (left + right)/2;
		 if(array[left] > array[center]) {
			 swap(array, left, center);
		 }
		 if(array[left] > array[right]) {
			 swap(array, left, right);
		 }
		 if(array[center] > array[right]) {
			 swap(array, center, right);
		 }
		 return array[center];
		
		
	}
	public static int getPivot_First(int[] array, int left, int right) {
		return array[left];
		
	}
	public static int getPivot_Last(int[] array, int left, int right) {
		return array[right];
		
	}
	private static int getPivot_Random(int[] array, int left, int right) {
		Random rd = new Random();
		int randomIndex = rd.nextInt(right-left+1) +left;
		return array[randomIndex];
		
		
		
	}
	public static void main(String[] args) {
		int[] arr = {12,2,6,74,29};
		quickSort(arr, 0, arr.length-1);
		for(int num:arr) {
			System.out.println(num);
		}
		int pivot = getPivot_MedianOfThree(arr, 0, 4);
		System.out.println("giá trị pivot(Median of three):" + pivot);
		int pivot1= getPivot_First(arr, 0, 4);
		System.out.println("giá trị pivot lấy ở ptu dau tien:" + pivot1);
		int pivot2= getPivot_Last(arr, 0, 4);
		System.out.println("gia tri pivot lay ở ptu cuoi cung:" + pivot2);
		int pivot3= getPivot_Random(arr, 0, 4);
		System.out.println("gia tri pivot lay ở ptu bat ki:" + pivot3);
	}
	

}
