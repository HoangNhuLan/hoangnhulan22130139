package Lab2_Recursion;

import java.util.Arrays;

public class PascalTriangle {
    public static int[] generateNextRow(int[] preRow) {
        int[] result = new int[preRow.length + 1];
        result[0] = 1;
        result[result.length - 1] = 1;
        for (int i = 1; i < result.length - 1; i++) {
            result[i] = preRow[i - 1] + preRow[i];
        }

        return result;
    }

    public static int[] getPascalTriangle(int n) {
        if (n == 1) {
            return new int[] {1};
        }else {
            int[] preRow = getPascalTriangle(n - 1);
            return generateNextRow(preRow);
        }
    }

    public static void printPascalTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            System.out.println(Arrays.toString(getPascalTriangle(i)));
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1};
        int[] arr1 = {1, 3, 3, 1};
        System.out.println(Arrays.toString(generateNextRow(arr)));
        System.out.println(Arrays.toString(generateNextRow(arr1)));
        
        System.out.println(Arrays.toString(getPascalTriangle(3)));
        System.out.println(Arrays.toString(getPascalTriangle(4)));
        System.out.println(Arrays.toString(getPascalTriangle(1)));
        System.out.println("Pascal Triangle:");
        printPascalTriangle(4);
    }
}
   
	

