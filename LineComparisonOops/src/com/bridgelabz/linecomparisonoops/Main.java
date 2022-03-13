package com.bridgelabz.linecomparisonoops;

public class Main {
	public static void main(String[] args) {
		LineComparison line1 = new LineComparison(16,5,7,0);
		double lineLength1 = line1.calculate_length();
		System.out.println("Length of the line1 is:  "+lineLength1);
		
		LineComparison line2 = new LineComparison(16,5,7,56);
		double lineLength2 = line2.calculate_length();
		System.out.println("Length of the line2 is:  "+lineLength2);
		LineComparison.check_Equality(lineLength1, lineLength2);
		LineComparison.compare_Lines(lineLength1, lineLength2);
	}
}
