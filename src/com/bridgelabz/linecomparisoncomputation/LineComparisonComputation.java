package com.bridgelabz.linecomparisoncomputation;

import java.util.Scanner;
public class LineComparisonComputation 
{
	
	public void lineLength(int x1,int y1,int x2,int y2) 
		{
			double length=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			System.out.println("Length of Line is " + length);
		}
		

		public static void main(String[] args) 
		{
			LineComparisonComputation ob=new LineComparisonComputation();
			Scanner scannerObject=new Scanner(System.in);
			System.out.println("Welcome to Line Comparison Computation Program ");
			System.out.println("Enter the coordinates (x1, y1, x2 and y2) of line ");
			int x1=scannerObject.nextInt();
			int y1=scannerObject.nextInt();
			int x2=scannerObject.nextInt();
			int y2=scannerObject.nextInt();
			ob.lineLength(x1, y1, x2, y2);
			
		}
			

}


