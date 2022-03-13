package com.bridgelabz.linecomparisonoops;

public class LineComparison {
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	
	public LineComparison(double x1,double y1,double x2,double y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}

	public double calculate_length() {
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return length;
    }
	static void check_Equality(Double lineLength1,Double lineLength2) {
		if(lineLength1.equals(lineLength2)) {
			System.out.println("Both the lines are equal");
		}else
			System.out.println("Both the lines are not equal");
	}
	
}
