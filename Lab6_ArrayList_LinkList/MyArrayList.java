package Lab6_ArrayList_LinkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MyArrayList<E>{
	public static final int DEFAULT_CAPACITY =10;
	private E[] elements;
	private int size;
	
	public MyArrayList() {
		this.elements = (E[]) new Object[DEFAULT_CAPACITY];
	}
	
	public MyArrayList(int capacity) {
		this.elements = (E[]) new Object[capacity];
	}
//creates an array of double-size if the array of
//elements is full
	public void growSize() {
		if(size == elements.length) {
			int newCapacity = elements.length*2;
			E[] newElements = (E[]) new Object[newCapacity];
			newElements = Arrays.copyOf(elements, newCapacity);
			elements = newElements;
		}
	}
// Returns the number of elements in this list.
	public int size() {
		return this.size;
		
	}
// Returns whether the list is empty.
	public boolean isEmpty() {
		return size == 0;
		
	}
// Returns (but does not remove) the element at index i
	public E get (int i) throws IndexOutOfBoundsException{
		if(i<0 || i>= size) {
			throw new IndexOutOfBoundsException();
		}
		return elements[i];
	
	}
// Replaces the element at index i with e, and returns the replaced element. ∗/
	public E set (int i, E e) throws IndexOutOfBoundsException{
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException();
		}
		E elementsReplace = elements[i];
		elements[i] = e;
		return elementsReplace;
	}
//It is used to append the specified element at the end of a list.

	public boolean add(E e) {
		if(size == elements.length) {
		growSize();
		}
	 elements[size++] = e;
			return true;
	}
// Inserts element e to be at index i, shifting all subsequent elements later.
	public void add(int i, E e) throws IndexOutOfBoundsException{
		if(i<0 || i>=size) {
			throw new IndexOutOfBoundsException();
		}
		if(size == elements.length) {
			growSize();
			}
		for(int j = size; i< j; j--) {
			elements[j] = elements[j-1]; 
		}
		elements[i] = e;
		size++;

	}
// Removes and returns the element at index i, shifting subsequent elements earlier.
	public E remove( int i) throws IndexOutOfBoundsException{
		if(i<0 || i>= size) {
			throw new IndexOutOfBoundsException();
		}
		E removedElement = elements[i];
		for(int j = i; j< size-1; j++) {
			elements[j] = elements[j+1];
		}
		elements[size-1] = null;
		size--;
		return removedElement;
		
	}
// It is used to clear all elements in the list.

	public void clear() {
		for(int i=0; i<size; i++) {
			elements[i] = null;
		}
		size =0;
		
	}
// It is used to return the index in this list of the last occurrence of
// the specified element, or -1 if the
// list does not contain this element.

	public int lastIndexOf(Object o) {
		int result = -1;
		for(int i= size-1; i>=0; i--) {
			if(elements[i] == null) {
				if(o == null) {
					i= result;
					break;
				}
			}
			else if( elements[i].equals(o)) {
				result = i;
				break;
			}
		}
		return result;
		
	}
// It is used to return an array containing all of the elements 
// in this list in the correct order.
	public E[] toArray() {
		E[] newArray = (E[]) new Object[size];
		for(int i=0; i< size; i++) {
			newArray[i] = elements[i];
		}
		return newArray;
	}
// It is used to return a shallow copy of an ArrayList.
	public MyArrayList<E> clone(){
		MyArrayList<E> cloneList = new MyArrayList<>(this.size);
		
		for(int i =0; i<size; i++) {
			cloneList.add(elements[i]);
		}
		return cloneList;
	}
// It returns true if the list contains the specified element
	public boolean contains(E o) {
		for(int i =0; i<size; i++) {
			if(elements[i].equals(o)) {
				return true;
			}
		}
		return false;
	}
// It is used to return the index in this list of the
// first occurrence of the specified element, or -1 if the
// List does not contain this element.

	public int indexOf(E o) {
		int result =-1;
		for(int i =0; i<size; i++) {
			if(elements[i].equals(o)) {
				result = i;
				break;
			}
		}
		return result;
	}
// It is used to remove the first occurrence of the specified element.
	public boolean remove(E o) {
		for(int i=0;i< size; i++) {
			if(elements[i].equals(o)) {
				for(int j =i; j<size -1; j++) {
					elements[j] = elements[j+1];
				}
				elements[size-1] = null;
				size--;
				return true;
			}
		}
		return false;
	}
//It is used to sort the elements of the list on the basis of specified comparator.
	public void sort(Comparator<E> c) {
		Arrays.sort(elements, 0, size, c); 
	}
	public static void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList<>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(5);
		list.add(7);
		list.add(20);
		// test phuong thuc size()
		System.out.println( "Kich thuoc cua phan tu trong mang: " + list.size);
		System.out.println("-----------------------------------------------------------");
		
		// test phuong thuc isEmpty()
		System.out.println("Phan tu trong mang co trong hay khong? " + list.isEmpty());
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc E get(int i)
		Integer returnNotRemove = list.get(6);
		System.out.println("Ptu se tra ve tai index i la: " + returnNotRemove);
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc E set(int i, E e)
		Integer replaceElement = list.set(2, 3);
		System.out.println("Ptu se thay doi: " + replaceElement);
		System.out.println("Danh sach ptu sau khi thay doi la: " + Arrays.toString(list.toArray()) );
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc add(int i)
		list.add(15);
		System.out.println("Danh sach sau khi them 15 vao vi tri cuoi la:" + Arrays.toString(list.toArray()));
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc add(int i, E e)
		list.add(3, 8);
		System.out.println("Danh sach sau khi them 8 vao vi tri 3 la:" + Arrays.toString(list.toArray()));
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc remove(int i)
		Integer removeElements = list.remove(4);
		System.out.println("Ptu bi loai bo la: "+ removeElements );
		System.out.println("Danh sach ptu sau khi có ptu bi loai bo la: " + Arrays.toString(list.toArray()));
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc lastIndexOf(Object o)
		int lastIndex = list.lastIndexOf(5);
		System.out.println("Vi tri cuoi cung xuat hien so 5 la:" + lastIndex);
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc E[] toArray()
		System.out.println("Danh sach mang chua cac ptu moi la:" + Arrays.toString(list.toArray()));
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc MyArrayList<E>clone()
		MyArrayList<Integer> cloneList = list.clone();
		System.out.println("Danh sach ban dau:" + Arrays.toString(list.toArray()));
		System.out.println("Danh sach clone:" + Arrays.toString(cloneList.toArray()));
		list.add(4);
		System.out.println("Danh sach sau khi them ptu :" + Arrays.toString(list.toArray()));
		System.out.println("Danh sach clone sau khi them ptu :" + Arrays.toString(cloneList.toArray()));
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc contains(E o)
		boolean find = list.contains(10);
		boolean find1 = list.contains(3);
		System.out.println("Danh sach co chua so 10 khong? " + find);
		System.out.println("Danh sach co chua so 3 khong? " + find1);
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc indexOf(E o)
		int firstIndex = list.indexOf(10);
		System.out.println("Vi tri dau tien xuat hien so 10 la:" + firstIndex);
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc remove(E o)
		list.remove(3);
		System.out.println("Danh sách sau khi xoa phan tu: " + Arrays.toString(list.toArray()));
		System.out.println("-----------------------------------------------------------");
		
		
		// test phuong thuc sort(Comparator<E> c
		System.out.println("Danh sách truoc khi sap xep: " + Arrays.toString(list.toArray()));
	    list.sort(null);
	    System.out.println("Danh sách sau khi sap xep: " + Arrays.toString(list.toArray()));
	    System.out.println("-----------------------------------------------------------");
		
	    
	    // test phuong thuc clear()
	    list.clear();
	    System.out.println("Danh sach sau khi xoa tat ca cac phan tu trong mang:" + Arrays.toString(list.toArray()));
	}
	

}
 