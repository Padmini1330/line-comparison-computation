package com.bridgelabz.linecomparisoncomputation;

import java.util.Scanner;
public class LineComparisonComputation 
{
	public static void main(String[] args) 
	{
		LineComputation line1 = new LineComputation(5, 3, 1, 5);
		LineComputation line2 = new LineComputation(2, 7, 4, 2);
		line1.lineLength();
		line2.lineLength();
		line1.equalityOfLines(line2);
		line1.comparisonOfLines(line2);
		

	}
			

}


