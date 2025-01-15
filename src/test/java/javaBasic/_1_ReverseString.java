package javaBasic;

public class _1_ReverseString {
	
	public static void main(String[] args) {
		
		String test = "Hi There How Are You?";
		
		char[] charArray = test.toCharArray();
		
		for(int i = charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}	
	}
}
