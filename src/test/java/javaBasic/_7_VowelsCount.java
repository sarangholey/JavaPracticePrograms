package javaBasic;

public class _7_VowelsCount {

	public static void main(String[] args) {
		
		String str = "I love Java VERY Much";
		int Vcount = 0;
		for(int i=0; i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				Vcount++;
			}
		}
		System.out.println("Total Vowel count in String is : " + Vcount );
	}
	
	public static boolean isVowel(char t) {
		return t=='a' || t=='e' || t=='i' || t=='o' || t=='u' ||
			   t=='A' || t=='E' || t=='I' || t=='O' || t=='U' ;
	}

}
