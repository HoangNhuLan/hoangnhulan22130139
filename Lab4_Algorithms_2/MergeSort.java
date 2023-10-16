package Lab4_Algorithms_2;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int [] array, int first, int last ) {
		if(first < last) {
			int middle = (first + last)/2;
			mergeSort(array, first, middle);
			mergeSort(array, middle+1, last);
			merge(array, first, middle, last);
		}
		
	}
	public static void merge(int [] array,int first, int middle, int last) {
		int n1 = middle - first +1; 
		// độ dai mang ben trai lấy giữa trừ đầu +1 
		// vi du: array.length =8; thi middle=4; leftArray.length = 4-0+1=5
		int n2 = last - middle; 
		// độ dài mang ben phai lay cuoi tru giua
		// vi du: rightArray.length = 8-4 =4
		int [] leftArray = new int[middle -first +1];
		int [] rightArray = new int[last - middle];
		
		for(int i=0; i< n1; i++) {
			leftArray[i] = array[first +i];
		}
		for(int i=0; i< n2; i++) {
			rightArray[i] = array[middle +1 +i];
		}
		int i=0;
		int j=0;
		int k =first;
		
		while (i< n1 && j<n2) {
			if(leftArray[i] < rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}
			else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i< n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,4,7,-2,8,3};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
