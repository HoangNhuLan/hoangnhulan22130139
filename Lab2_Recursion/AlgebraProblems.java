package Lab2_Recursion;

import java.util.Scanner;

public class AlgebraProblems {
	public static int getSn1(int n) {
		if(n == 1) 
			return 1;
		else
			return getSn1(n-1)+(int)Math.pow(-1, n +1)*n;	
			
	}
	public static int factory (int n) {
		if(n == 0)
			return 1;
		else
			return n * factory(n-1);

	}
	public static int getSn2(int n) {
		if(n ==1) 
			return 1;
		else
			return getSn2 (n-1) + factory(n);
	}
	public static int  getSn3 (int n) {
		if (n ==1)
			return 1;
		else
			return  getSn3(n-1)+ n*n;
	}
	public static double factory2(int n) {
		if ( n == 0)
			return 1;
		else
			return n*2* factory2(n-1);
	}
	
	public static double getSn4(int n) {
		if(n==1)
			return 1;
		else
			return getSn4(n-1)+1/factory2(n-1);
	}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhập vào n: ");
			int n = sc.nextInt();
			System.out.println(getSn1(n));
			System.out.println(getSn2(n));
			System.out.println(getSn3(n));
			System.out.println(getSn4(n));
			
			
			
	}
	
	

}
