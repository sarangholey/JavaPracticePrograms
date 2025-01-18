package javaBasic;

public class _8_AverageOfArray {

	public static void main(String[] args) {
		double num[] = {1,2,3,4,5,6,7,8};
		double total = 0;
		for(double e:num) {
			total = total + e;
		}
		System.out.println("Total is : " + total);
		System.out.println("Average is : " + (total/num.length));

	}

}
