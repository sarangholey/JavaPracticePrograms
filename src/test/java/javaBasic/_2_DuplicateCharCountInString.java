package javaBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _2_DuplicateCharCountInString {
	
	public static void main(String[] args){
		String str = "Java programming";
		printDuplicateChars1(str);
		printDuplicateChars2(str);
	}
	
	public static void printDuplicateChars1(String str) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[] = str.toCharArray();
		for(char c : strArray) {
			//if(!String.valueOf(c).isBlank()) {
				if(charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c)+1);
				}
				else {
					charMap.put(c, 1);
				}
			//}	
		}
		System.out.println(str + " : " + charMap);
	}
	
	public static void printDuplicateChars2(String str) {
		if(str == null)      {System.out.println("NULL String"); return;}
		if(str.isEmpty())    {System.out.println("Empty String"); return;}
		if(str.length() ==1) {System.out.println("Single Char String"); return;}
		char words[] = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(Character ch : words) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else {
				charMap.put(ch, 1);
			}
		}
		//Print HashMap
		Set<Map.Entry<Character,Integer>> entrySet = charMap.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue() > 1){
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}
}
