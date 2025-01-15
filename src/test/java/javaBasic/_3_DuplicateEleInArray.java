package javaBasic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class _3_DuplicateEleInArray {
	
	public static void main(String args[]) {
		String infra[] = {"Amazon", "GCP", "Azure", "Amazon","Ali Baba", "Sauce Labs", "Azure", "GCP"};
		printDuplicateValInArray1(infra);
		printDuplicateValInArray2(infra);
		printDuplicateValInArray3(infra);
	}
	// Way 1 - Brute Force - Time Complixity O^2
	public static void printDuplicateValInArray1(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	// Way 2 - HashSet
	public static void printDuplicateValInArray2(String[] arr) {
		Set<String> data = new HashSet<String>();
		for(String e : arr) {
			if(data.add(e) == false) {
				System.out.println(e);
			}
		}
	}
	// Way 3 - HashMap
	public static void printDuplicateValInArray3(String[] arr) {
		Map<String, Integer> infraMap = new HashMap<String, Integer>();
		for(String e : arr) {
			Integer count = infraMap.get(e);
			if(count == null) {
				infraMap.put(e, 1);
			}
			else {
				infraMap.put(e, ++count);
			}
		}
		Set<Entry<String, Integer>> entrySet = infraMap.entrySet();	
		for(Entry<String, Integer> entry : entrySet){
			if(entry.getValue() > 1){
				System.out.println(entry.getKey());
			}
		}
	}
}
