package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MyWordCount {
	// public static final String fileName = "data/hamlet.txt";
	public static final String fileName = "data/fit.txt";

	private List<String> words = new ArrayList<>();

	public MyWordCount() {
		try {
			this.words.addAll(Utils.loadWords(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt)
	// In this method, we do not consider the order of tokens.
	public List<WordCount> getWordCounts() {
		List<WordCount> result = new ArrayList<>();
		for(String word : words) {
			WordCount wc1 = new WordCount(word, count(word));
			if(!result.contains(word)) {
				result.add(wc1);
			}
		} 
		return result;
	}
	public int count(String w) {
		int count =0;
		for(String st: words) {
			if(w.equals(st)) {
				count++;
			}
		}
		return count;
	}

	// Returns the words that their appearance are 1, do not consider duplidated
	// words
	// hashset la vi tri bi dao(can overwrite)
	// linkhashset la theo thu tu chu ( ko can ovewrite)
	public Set<String> getUniqueWords() {
		Set<String> result = new HashSet<>();
		for(WordCount wc: getWordCounts()) {
			if(wc.getCount() ==1) {
				result.add(wc.getWord());
			}
		}
		return result;
	}

	// Returns the words in the text file, duplicated words appear once in the
	// result
	// treeset la lay nhung tu ko lap, bo tu lap
	public Set<String> getDistinctWords() {
		Set<String> result = new LinkedHashSet<>();
		for(String words: words) {
			result.add(words);
		}
		
		return result;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according ascending order of tokens
	// Example: An - 3, Bug - 10, ...
	public Set<WordCount> printWordCounts() {
		Set<WordCount> result = new TreeSet<WordCount>(new Comparator<WordCount>() {

			@Override
			public int compare(WordCount wc1, WordCount wc2) {
				int count = wc1.getCount()- wc2.getCount();
				if(count ==0) {
					return wc1.getWord().compareTo(wc2.getWord());
				}
				return count;
			}
		});
		result.addAll(getWordCounts());
		return result;
	}

	// Prints out the number of times each unique token appears in the file
	// data/hamlet.txt (or fit.txt) according descending order of occurences
	// Example: Bug - 10, An - 3, Nam - 2.
	public Set<WordCount> exportWordCountsByOccurence() {
		// TODO
		Set<WordCount> result = new TreeSet<WordCount>(new Comparator<WordCount>() {

			@Override
			public int compare(WordCount o1, WordCount o2) {
				// TODO Auto-generated method stub
				int count = o2.getCount() - o1.getCount();
				if(count ==0) {
					return o2.getWord().compareTo(o1.getWord());
				}
				return count;
			}
		});
		result.addAll(getWordCounts());
		return result;
	}

	// delete words begining with the given pattern (i.e., delete words begin with
	// 'A' letter
	public Set<String> filterWords(char pattern) {
		// TODO
		Set<String> re= new HashSet<String>();
		for (String word: words) {
			if(!(word.charAt(0)==pattern)) {
				re.add(word);
			}
		}
		return re;
	}
	public static void main(String[] args) {
       MyWordCount my= new MyWordCount();
       List<WordCount> re =  my.getWordCounts();
       System.out.println(re);
       Set<String> s = my.getUniqueWords();
       System.out.println(s);
       Set<String> s1 = my.getDistinctWords();
       System.out.println(s1);
       Set<WordCount> s2 = my.printWordCounts();
       System.out.println(s2);
       Set<WordCount> s3= my.exportWordCountsByOccurence();
	   System.out.println(s3);
	   Set<String> filtertWord= my.filterWords('D');
	   System.out.println(filtertWord);
	}
}
 