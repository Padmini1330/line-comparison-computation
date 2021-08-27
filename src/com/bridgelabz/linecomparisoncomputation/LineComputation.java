package com.bridgelabz.linecomparisoncomputation;

public class LineComputation 
{
	int x1, x2, y1, y2;
	Double length=new Double(2);
	
	public LineComputation(int x1, int y1, int x2, int y2) 
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void lineLength() 
	{
		
		length=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of Line is " + length);
	}

	public void equalityOfLines(LineComputation line) 
	{
		if((this.length).equals(line.length))
			System.out.println("The Lines are equal");
		else
			System.out.println("The Lines are not equal");

	}

	public void comparisonOfLines(LineComputation line) 
	{
		switch((this.length).compareTo(line.length))
		{
			case 0: System.out.println("Line 1 and Line 2 are of same length");
			break;
			case 1: System.out.println("Line 1 is greater than Line 2");
			break;
			case -1: System.out.println("Line 2 is greater than Line 1");
			break;
			default: break;
		}
	}
	
}
