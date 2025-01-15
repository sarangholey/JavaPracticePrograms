package javaBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class _5_DuplicateWordsInString {

	public static void main(String args[]) {
		String statement = "I love java and java";
		duplicateWords(statement);
	}

	public static void duplicateWords(String str) {
		String wordsArr[] = str.split(" ");
		Map<String, Integer> wordCountMap = new HashMap<String, Integer>();
		for(String word : wordsArr) {
			if(wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word)+1);
			}
			else {
				wordCountMap.put(word, 1);
			}
		}
		Set<String> wordsInString = wordCountMap.keySet();
		for(String word : wordsInString) {
			if(wordCountMap.get(word) > 1) {
				System.out.println(word + " : " + wordCountMap.get(word));
			}
		}	
	}
}
