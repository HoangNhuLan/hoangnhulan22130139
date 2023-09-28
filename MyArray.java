package Lab1_OneDimensionalArrays;

import java.awt.DisplayMode;
import java.util.Arrays;

/*
 * this is class MyArray consist of : int[] array
 */
public class MyArray {
	private int[] array;
	public MyArray( int[] array) {
		this.array = array;	
	}
// Method mirror that outputs the contents of an array in a reverse
// order like a mirror
// example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	public int[] mirror() {
		int [] result = new int [array.length * 2];
		for (int i =0; i< array.length; i++) {
			result[i] = array[i];
			result[array.length*2-1-i] = array[i];
		}
		return result;
		
	}
// removes all duplicate elements from an array and returns a new array
// input: 1 3 5 1 3 7 9 8
// output: 1 3 5 7 9 8
	public int [] removeDuplicates() {
		Arrays.sort(array);
		int [] result1 = new int [array.length-1];
		int resultIndex = 0; // dc sử dụng để ghi lại vị trí trong mảng
		for (int i =0; i< array.length; i++) {
			boolean isDuplicate = false;
// chạy xuống for thứ 2, nếu phần tử thứ i trong array trùng với phần tử thứ j trong result1 => bị trùng lặp => loại			
			for (int j =0; j <resultIndex ; j++) {
				if (array[i] == result1[j]) {
					isDuplicate = true;
					break;
				}
			}
// ko trùng lặp thì kết quả result1 sẽ là số phẩn tử đã được lọc ở resultIndex ++ là từ 0 tăng lên
			if ( ! isDuplicate) {
				result1[resultIndex++] = array[i];
			}
			}
		return result1;
		
	}
//Input: 10 11 12 13 14 16 17 19 20
//Output: 15 18
	public int [] getMissingValue () {
		int [] missingValues = new int [array.length];
		int missingIndex =0;
		for (int i = array[0]; i <= array[array.length -1]; i++ ) {
			boolean isFind = false;
			for (int j =0; j <array.length; j++) {
				if (array [j] == i) {
					isFind = true;
					break;
				}
			}
			if (!isFind) {
				missingValues[missingIndex++] = i;
			}
			
		}
		int[]result2 = new int[missingIndex];
		for(int m =0; m < missingIndex; m++) {
			result2[m] = missingValues[m];
		}
		return result2;
		
	}
//Input: 10 11 12 -1 14 10 17 19 20
// Output(k=3): 10 11 12 12 14 16 17 19 20
	public int[] fillMissingValues (int k, int [] arr ) {
		int [] result3 = new int [arr.length];
		for (int i =0; i < arr.length; i++) {
			if (arr[i] == -1) {
				result3[i] = k;
				
			}
			else {
				result3[i] = arr[i];
			}
		}
		return result3;
	}
	
	
	public static void main(String[] args) {
		int[] array = new int [] {1,2,3};
		int[] array1 = new int [] {1,3,5,1,3,7,9,8};
		int[] array2 = new int [] {10,11,12,13,14,16,17,19,20};
		int[] array3 = new int [] {10,11,12,-1,14,10,17,19,20};
		MyArray myArr = new MyArray(array);
		MyArray myArr1 = new MyArray(array1);
		MyArray myArr2 = new MyArray(array2);
		MyArray myArr3 = new MyArray(array3);
		int[] newArr = myArr.mirror();
		int[] newArr1 = myArr1.removeDuplicates();
		int[] newArr2 = myArr2.getMissingValue();
		int[] newArr3 = myArr3.fillMissingValues(3, array3);
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(newArr1));
		System.out.println(Arrays.toString(newArr2));
		System.out.println(Arrays.toString(newArr3));
		
		
		
		
	}
}
 