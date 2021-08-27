package com.bridgelabz.linecomparisoncomputation;


public class LengthCalculatorImplementation implements LengthCalculatorInterface
{
	@Override
	public double calculateLength(Line line1) 
	{
		int x1 = line1.getStartPoints().getXCoordinate();
		int y1 = line1.getStartPoints().getYCoordinate();
		int x2 = line1.getEndPoints().getXCoordinate();
		int y2 = line1.getEndPoints().getYCoordinate();
		
		double result= Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		return result;
				
	}
}
