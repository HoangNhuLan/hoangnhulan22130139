package Lab3_Algorithms;

import java.util.Arrays;

public class BinarySearch {
	private int[] array;
	public BinarySearch(int[] array) {
		this.array = array;
	}
// To find the index of the target in the sorted array. If the
//target is not found in the array, then the method returns -1.

	public int iterativeBinarySearch (int target) {
		int low = 0;
		int high = array.length -1;
		while(low <= high) {
			int mid =(low + high)/2;
			if(target == array[mid])
				return array[mid];
			else if (target <array[mid])
				high = mid -1;
			else
				low = mid +1;
		}
		return -1;
	}
// To find the index of the target in the sorted array. If the
// target is not
// found in the array, then the method returns -1.
	public int recursiveBinarySearch( int target, int low, int high) {
		if(low> high)
			return -1;
		else {
			int mid = (low + high)/2;
			if(target == array[mid])
				return array[mid];
			else if (target <array[mid])
				return recursiveBinarySearch(target, low, mid -1);
			else
				return recursiveBinarySearch(target, mid+1, high);
		}
		
		
	}

	
	public static void main(String[] args) {
		int [] array = new int [] {12, 10, 9, 45, 2, 10, 10, 45};
		Arrays.sort(array);
		BinarySearch arr = new BinarySearch(array);
		System.out.println("Sorted array:" + Arrays.toString(array));
		System.out.println("Index of 13: "+ arr.iterativeBinarySearch(13));
		System.out.println("Index of 13: "+ arr.iterativeBinarySearch(13));
	}

}
