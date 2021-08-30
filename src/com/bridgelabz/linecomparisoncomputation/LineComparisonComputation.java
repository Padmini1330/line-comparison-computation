package com.bridgelabz.linecomparisoncomputation;

import java.util.Scanner;

public class LineComparisonComputation 
{
	public static void main(String args[]) 
	{
		Scanner scanner = new Scanner(System.in);
		Line line1 = new Line();
		Line line2 = new Line();
		System.out.println("******WELCOME TO LINE COMPARISON COMPUTATION PROBLEM******");
		System.out.println("Enter Points of line 1 (x1, y1, x2, y2)");
		int line1X1 = scanner.nextInt();
		int line1Y1 = scanner.nextInt();
		int line1X2 = scanner.nextInt();
		int line1Y2 = scanner.nextInt();
		line1.setStartPoints(line1X1, line1Y1);
		line1.setEndPoints(line1X2, line1Y2);
		
		System.out.println("Enter Points of line 2 (x1, y1, x2, y2)");
		int line2X1 = scanner.nextInt();
		int line2Y1 = scanner.nextInt();
		int line2X2 = scanner.nextInt();
		int line2Y2 = scanner.nextInt();
		line2.setStartPoints(line2X1, line2Y1);
		line2.setEndPoints(line2X2, line2Y2);
		
		LengthComparisonInterface lengthComparator = new LengthComparisonImplementation();
		lengthComparator.equalsMethod(line1, line2);
		lengthComparator.compareToMethod(line1, line2);
	}
			

}


