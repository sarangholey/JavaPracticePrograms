package javaBasic;

public class _14_StarPatternPrinting_1 {
	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****	
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
//		*****
//		****
//		***
//		**
//		*
		for(int i=0; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
