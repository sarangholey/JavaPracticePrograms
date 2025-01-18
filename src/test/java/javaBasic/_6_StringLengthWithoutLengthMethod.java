package javaBasic;

public class _6_StringLengthWithoutLengthMethod {

	public static void main(String[] args) {
		
		String str = "corejava";
		// Way - 1
		System.out.println(str.toCharArray().length);
		// Way - 2
		System.out.println(str.lastIndexOf(""));
		// Way - 3
		System.out.println(str.split("").length);
		// Way - 4
		int count = 0;
		for(char c : str.toCharArray()){
			count++;
		}
		System.out.println(count);
	}
}
