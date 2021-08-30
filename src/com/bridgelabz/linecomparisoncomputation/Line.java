package com.bridgelabz.linecomparisoncomputation;

public class Line 
{
	Point startPoints = new Point();
	Point endPoints = new Point();
	
	public Point getEndPoints() 
	{
		return endPoints;
	}
	
	public Point getStartPoints() 
	{
		return startPoints;
	}
	
	public void setStartPoints(int x1, int y1) 
	{
		startPoints.setXCoordinate(x1);
		endPoints.setYCoordinate(y1);
	}
	
	public void setEndPoints(int x2, int y2) 
	{
		startPoints.setXCoordinate(x2);
		endPoints.setYCoordinate(y2);
	}
}
