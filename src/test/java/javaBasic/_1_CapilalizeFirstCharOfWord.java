package javaBasic;

public class _1_CapilalizeFirstCharOfWord {

	public static void main(String[] args) {
		String str = "hello there how are you";
		System.out.println(capitalizeFirstChar(str));
	}
	
	public static String capitalizeFirstChar(String str) {
		String words[] = str.split(" ");
		String result = "";
		for(String w: words) {
			String firstChar = w.substring(0,1).toUpperCase();
			String restString = w.substring(1);
			result = result + firstChar + restString + " ";
		}
		return result.trim();
	}

}
