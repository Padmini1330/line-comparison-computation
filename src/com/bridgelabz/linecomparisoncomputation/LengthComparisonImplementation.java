package com.bridgelabz.linecomparisoncomputation;


public class LengthComparisonImplementation implements LengthComparisonInterface
{
	LengthCalculatorInterface lengthObject = new LengthCalculatorImplementation();

	public void equalsMethod(Line line1, Line line2) 
	{

		Double line1Length = lengthObject.calculateLength(line1);
		Double line2Length = lengthObject.calculateLength(line2);
		
		if(line1Length.equals(line2Length)) 
		{
			System.out.println("Line 1 and Line 2 are Equal");
		}
		else 
		{
			System.out.println("Line 1 and Line 2 are not equal");
		}
	}

	public void compareToMethod(Line line1, Line line2) 
	{
		
		Double line1Length = lengthObject.calculateLength(line1);
		Double line2Length = lengthObject.calculateLength(line2);
	
		switch(line1Length.compareTo(line2Length))
		{
		case 0: System.out.println("Line 1 is equal to Line 2");
		break;
		case 1: System.out.println("Line 1 is greater than Line 2");
		break;
		case -1: System.out.println("Line 1 is smaller than Line 2");
		break;
		
		default: break;
			
		}
		
	}
}

