package Lab10_Stack_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyLIFO_App {
	// This method reserves the given array
	public static <E> void reserve(E[] array) {
	// TODO
		Stack<E> result = new Stack<>();
		for(E e : array) {
			result.push(e);
		}
		for(int i =0; i<array.length; i++) {
			array[i] = result.pop();
		}
	}
	// This method checks the correctness of the
	//given input
	// i.e. ()(())[]{(())} ==> true, ){[]}() ==>
	//false
	public static boolean isCorrect(String input) {
	// TODO
		Stack<Character> stack = new Stack<>();
		char[] chars = input.toCharArray();
		
		for(Character c : chars){
			if(c == '(' | c == '{' | c == '[') {
				stack.push(c);
			}else if(c == ')' | c == '}' | c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ( c == '(' && top != ')' ||
						c == '{' && top != '}' ||
						c == '[' && top != ']') {
					return false;
				}
			}
		}
	return stack.isEmpty();
	}
	// This method evaluates the value of an
	//expression
	// i.e. 51 + (54 *(3+2)) = 321
	public static int evaluateExpression(String expression) {
	// TODO

	return 0;
	}
	public static String addBlanks(String input) {
		String re = "";
		for(int i= 0; i <input.length(); i++) {
			if(input.charAt(i) == '+'||input.charAt(i) == '-' ||input.charAt(i) == '*'
					|| input.charAt(i) == '/') {
				re = re + " " + input.charAt(i) +" ";
			}else {
				re = re + input.charAt(i);
			}
		}
		return re;
	}
	// method stutter that accepts a queue of integers a parameter and replaces
	// every element of the queue with two copies of that element
	// front [1, 2, 3] back
	// becomes
	// front [1, 1, 2, 2, 3, 3] back
	public static <E> void stutter(Queue<E> input) {
	// TODO
		int size = input.size();
		for( int i =0; i< size; i++) {
			E element = input.poll();
			input.offer(element);
			input.offer(element);
		}
		
	}
	// Method mirror that accepts a queue of strings as a parameter and appends the
	// queue's contents to itself in reverse order
	// front [a, b, c] back becomes
	// front [a, b, c, c, b, a] back
	public static <E> void mirror(Queue<E> input) {
		  if (input == null) {
	            throw new IllegalArgumentException("Input queue cannot be null");
	        }
		  Stack<E> stack = new Stack<>();

		  int size = input.size();
	        while (!input.isEmpty()) {
	            stack.push(input.poll());
	            }
	  
	        while (!stack.isEmpty()) {
	            input.add(stack.pop());
	        }
	        for (int i =0; i< size; i++) {
	        	E element = input.poll();
	        	input.add(element);
	        }
	    }

	public static void main(String[] args) {
		Integer[] arr =  {2,3,1,5,7,7,9};
		// method reserve(Stack)
		reserve(arr);
		System.out.println(Arrays.toString(arr));
		// method isCorrect(Stack)
		System.out.println(isCorrect("()(())[]{(())}"));
		System.out.println(isCorrect("){[]}()"));
		// method stutter(Queue)
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		System.out.println("SIZE:" + queue);
		stutter(queue);
		System.out.println("STUTTER QUEUE:" + queue);
		
		Queue<String> queue2 = new LinkedList<>();
		queue2.offer("a");
		queue2.offer("b");
		queue2.offer("c");
		System.out.println("SIZE:" + queue2);
		mirror(queue2);
		System.out.println("MIRROR QUEUE:" + queue2);
		
		
	}

}
 