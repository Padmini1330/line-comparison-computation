package com.bridgelabz.linecomparisoncomputation;

import java.util.Scanner;
public class LineComparisonComputation 
{
	static double arr[]= new double[2];
	int i=0;
	
	public void lineLength(int x1,int y1,int x2,int y2) {
		double length=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		arr[i]=length;
		i++;
		System.out.println("Length of Line "+ i+ " is " + length);
	}
	
	public void lineComputation() {
		Double len1=new Double(arr[0]);
		Double len2=new Double(arr[1]);
		if(len1.equals(len2))
		{
			System.out.println("two lines are of equal length");
		}
		else
		{
			System.out.println("two lines are of different length ");
		}
	}
	

	public static void main(String[] args) {
		LineComparisonComputation ob=new LineComparisonComputation();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=2;i++) {
		System.out.println("Enter the coordinates (x1, y1, x2 and y2) of line "+ i);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		ob.lineLength(x1, y1, x2, y2);
		}
		ob.lineComputation();
		

	}
			

}


