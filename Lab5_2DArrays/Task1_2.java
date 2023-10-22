package Lab5_2DArrays;

public class Task1_2 {
	public static int[][] subtract (int[][] a, int[][] b){
		int row = a.length;
		int col= a[0].length;
		int result[][] = new int [row][col];
		for( int i =0; i < row; i++) {
			for(int j =0; j< col; j++) {
				result[i][j]= a[i][j] - b[i][j];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[][] array1 = {{7,2}, {5,3}};
		int[][] array2 = {{2,1}, {3,1}};
		
		int sub [][] = subtract(array1, array2);
		for(int i =0; i<sub.length; i++) {
			for(int j=0; j< sub[i].length; j++) {
				System.out.print(sub[i][j] + " ");
			}
			System.out.println();
		}
	}

}
