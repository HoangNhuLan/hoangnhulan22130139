package Lab2_Recursion;
//Using recursive approach to implement Fibonacci problem. Note,
//Fibonacci - next number is the sum of previous two numbers.
//Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …
public class Fibonacci {
	public static int getFibonacci (int n) {
		if(n <= 1)
			return n;
		else
		    return getFibonacci(n-1) + getFibonacci(n-2);
		
	}
	public static void printFibonacci(int n) {
		for(int i =0; i<n; i++) {
			System.out.println(getFibonacci(i));
		}
	}
	public static void main(String[] args) {
		printFibonacci(6);
	}

}
