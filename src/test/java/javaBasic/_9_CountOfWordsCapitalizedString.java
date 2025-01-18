package javaBasic;

public class _9_CountOfWordsCapitalizedString {

	 public static void main(String[] args) {
	        String str = "This is a sample string";
	        int wordCount = countWords(str);
	        System.out.println("Word Count: " + wordCount);
	        
	        String capitalizedStr = "ThisIsASampleString";
	        System.out.println("CapitalizedWord Count: " + capitalizedCountWords(capitalizedStr));
	    }
	 
	    public static int countWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return 0;
	        }
	        String[] words = str.split(" ");
	        return words.length;
	    }
	    // ThisIsASampleString
	    public static int capitalizedCountWords(String str) {
	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ){
					count++;
				}
			}
	        return count;
	    }
}
