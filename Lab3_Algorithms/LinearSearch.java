package Lab3_Algorithms;

import java.util.Arrays;

public class LinearSearch{
		private int[] array;
		
		public LinearSearch(int [] array) {
			this.array =array;
			// TODO Auto-generated constructor stub
		}
// To find the index of the target in the array. If the target
// is not found in the array, then the method returns -1.
// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
// Output: 3
	
		public int iterativeLinearSearch(int target) {
			for(int i=0; i< array.length -1; i++) {
				if(array[i] == target)
					return i;
			}
			return -1;
		}
// To find the index of the target in the array. If the target
// is not found in the array, then the method returns -1.
// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
// Output: -1
		public int recursiveLinearSearch(int target, int index) {
			if(array[index -1] == target)
				return index -1;
			if(index == 1)
				return -1;
			return recursiveLinearSearch(target, index-1);
			
		}
		public int recursiveLinearSearch(int target) {
			return recursiveLinearSearch(target, array.length);
			}
		
		
		public static void main(String[] args) {
			int[] arr = new int []{12, 10, 9, 45, 2, 10, 10, 45};
			LinearSearch myArr = new LinearSearch(arr);
			int index = myArr.iterativeLinearSearch(45);
			int index1 = myArr.recursiveLinearSearch(15); 
			System.out.println( "Index of 45: " +index);
			System.out.println( "Index of 15: " +index1);
	       
		}
		
		
	
	}
