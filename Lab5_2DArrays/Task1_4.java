package Lab5_2DArrays;

public class Task1_4 {
	public static int[][] transpose(int[][] a){
		int row = a.length;
		int col = a[0].length;
		
		int result[][] = new int [col][row];
		for(int i =0; i< col; i++) {
			for(int j=0; j< row; j++) {
				result[i][j] = a[j][i];
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		int[][] array = {{1,2},{3,4},{5,6}};
		int[][] array1 = {{1,3,5}, {2,4,6}};
		int trans [][] = transpose(array);
		int trans1 [][] = transpose(array1);
		System.out.println("array:");
		for(int i =0; i<trans.length; i++) {
			for(int j=0; j< trans[i].length; j++) {
				System.out.print(trans[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("array1:");
		for(int i =0; i<trans1.length; i++) {
			for(int j=0; j< trans1[i].length; j++) {
				System.out.print(trans1[i][j] + " ");
			}
			System.out.println();
		}
	}

}
