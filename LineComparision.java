package com.demo;

import java.util.Scanner;
public class LineMain
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LineDemo2 obj=new LineDemo2();
	    
		System.out.println("--------------Line Values-------------");
		System.out.println("enter x1 value : ");
		int x1=sc.nextInt();
		obj.setX1(x1);
		System.out.println("enter y1 value : ");
		int y1=sc.nextInt();
		obj.setY1(y1);
		System.out.println("enter x2 value : ");
		int x2=sc.nextInt();
		obj.setX2(x2);
		System.out.println("enter y2 value : ");
		int y2=sc.nextInt();
		obj.setY2(y2);
		sc.close();
		
		//calling distance method in Linedemo2 class
		obj.distance();
		
	}
}


class LineDemo2
{

	int x1;
	int y1;
	int x2;
	//getters and setters
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getY1() {
		return y1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public int getY2() {
		return y2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	int y2;

	//calculating length of a line
	public  double distance()
	{
		double value=Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println(value);	
		return value;
	}

}
