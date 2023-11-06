package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

import javax.sql.rowset.spi.XmlWriter;

public class MyPredicates {
	// Remove every object, obj, from coll for which p.test(obj)
	// is true. (This does the same thing as coll.removeIf(p).)
	public static <T> void remove(Collection<T> coll, Predicate<T> p) {
		Iterator<T> result = coll.iterator();
		while(result.hasNext()) {
			T obj = result.next();
			if(p.test(obj)) {
				result.remove();
			}
		}
	}

	// Remove every object, obj, from coll for which
	// pr.test(obj) is false. (That is, retain the
	// objects for which the predicate is true.)
	public static <T> void retain(Collection<T> coll, Predicate<T> p) {
		// TODO
		Iterator<T> iterator = coll.iterator();
		while(iterator.hasNext()) {
			T obj = iterator.next();
			
			if(!p.test(obj)) {
				iterator.remove();
			}
		}
	}

	// Return a Set that contains all unique objects, obj,
	// from the collection, coll, such that p.test(obj)
	// is true.
	public static <T> Set<T> collect(Collection<T> coll, Predicate<T> p) {
		// TODO
		Set<T> result = new HashSet<>();
		for(T obj : coll) {
			if(p.test(obj)) {
				result.add(obj);
			}
		}
		return result;
	}

	// Return the index of the first item in list
	// for which the predicate is true, if any.
	// If there is no such item, return -1.
	public static <T> int find(Collection<T> coll, Predicate<T> p) {
		// TODO
		int index=0;
		for(T obj: coll) {
			if(p.test(obj)) {
				return index;
			}
			index++;
		}
		return -1;
	}
	public static void main(String[] args) {
		MyPredicates myPredicate = new MyPredicates();
		Even predicate= new Even();
		
		Integer[] arr = {4,6,2,6,2,9};
		Collection<Integer> coll = new ArrayList<>(Arrays.asList(arr));
		System.out.println("Method remove:");
		myPredicate.remove(coll, predicate);
		System.out.println(coll);
		
		System.out.println("Method retain:");
		Integer[] arr_retain = {4,6,2,6,2,9};
		Collection<Integer> coll_retain = new ArrayList<>(Arrays.asList(arr_retain));
		myPredicate.retain(coll_retain, predicate);
		System.out.println(coll_retain);
		
		System.out.println("Method collect:");
		Integer[] arr_collect = {4,6,2,6,2,9,5,8,9,8,9};
		Collection<Integer> coll_collect = new ArrayList<>(Arrays.asList(arr_collect));
		myPredicate.retain(coll_collect, predicate);
		System.out.println(coll_collect);
		
		System.out.println("Method find:");
		Integer[] arr_find = {4,6,2,6,2,9,5,8,9,8,9};
		Collection<Integer> coll_find = new ArrayList<>(Arrays.asList(arr_find));
		myPredicate.retain(coll_find, predicate);
		System.out.println(coll_find);
		
		
		
	}
}
