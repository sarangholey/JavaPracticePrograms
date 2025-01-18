package javaBasic;

public class _11_FindSubString {

	public static void main(String[] args) {
		System.out.println(checkSubString1("I love coding", "cod"));
		System.out.println(checkSubString1("I love java", "jav"));
	}

	public static boolean checkSubString1(String mainString, String subString) {
		return mainString.matches("(.*)" + subString + "(.*)");
	}
	
	public static boolean checkSubString2(String mainString, String subString) {
		return mainString.contains(subString);
	}

}
