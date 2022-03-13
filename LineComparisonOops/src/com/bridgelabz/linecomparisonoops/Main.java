package com.bridgelabz.linecomparisonoops;

public class Main {
	public static void main(String[] args) {
		LengthOfTheLine line1 = new LengthOfTheLine(16,5,7,56);
		double lineLength = line1.calculate_length();
		System.out.println("Length of the given line is:  "+lineLength);
	}
}
