package javaBasic;

public class _4_OccuranceOfCharInString {
	
	public static void main(String args[]) {
		String str = "i Love Coding";
		getOccuranceOfChar1(str, 'o');
		getOccuranceOfChar1(str, 'i');
		
	}
	public static void getOccuranceOfChar1(String str, char val) {
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(ch == val){
				count++;
			}
		}
		System.out.println(val + " : "+ count);
	}
	public static void getOccuranceOfChar2(String str, char val) {
		int count = 0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println(val + " : "+ count);
	}
}

