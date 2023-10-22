package Lab5_2DArrays;

public class Task1_1 {
	public static int [][] add(int[][] a, int[][] b){
		int row = a.length;
		int col = a[0].length;
		int result[][] = new int [row][col];
		for(int i =0; i< row;i++) {
			for(int j =0; j< col; j++ ) {
				result [i][j]= a[i][j] + b[i][j];
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int [][] array1 = {{7,2} ,{5,3}};
		int [][] array2 = {{2,1} ,{3,1}};
		int[][] sum = add (array1, array2);
		for(int i=0; i < sum.length;i++) {
			for(int j =0; j< sum[i].length;j++) {
				System.out.print(sum[i][j] +" ");
			}
			System.out.println();
		}
		
		
	}

}
