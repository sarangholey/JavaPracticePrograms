package javaBasic;

import java.util.HashMap;
import java.util.Map;

public class _12_charCountInString {

	public static void main(String[] args) {
		getCharCount("Hello there How are you");
	}
	
	public static void getCharCount(String str) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char charArray[] = str.toCharArray();
		for(char c: charArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}
			else {
				charMap.put(c, 1);
			}
		}
		System.out.println(str + " " + charMap);
	}
}
