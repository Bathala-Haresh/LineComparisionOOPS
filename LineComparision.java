package com.demo;
class LineDemo1
{

	int x1;
	int y1;
	int x2;
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
	public  double distance()
	{
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	    
	    
	}
	
}


package com.demo;

import java.util.Scanner;
import java.lang.Double;
public class LineMain
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LineDemo1 obj=new LineDemo1();
	    
		System.out.println("--------------Line1 Values-------------");
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
		
		LineDemo1 obj1=new LineDemo1();
		System.out.println("--------------Line2 Values-------------");
		System.out.println("enter x1 value : ");
		int a=sc.nextInt();
		obj1.setX1(a);
		System.out.println("enter y1 value : ");
		int c=sc.nextInt();
		obj1.setY1(c);
		System.out.println("enter x2 value : ");
		int b=sc.nextInt();
		obj1.setX2(b);
		
		System.out.println("enter y2 value : ");
		int d=sc.nextInt();
		obj1.setY2(d);
		
		sc.close();
		double d1=obj1.distance();
		double d2=obj.distance();
		equal(d1, d2);
	}
	public static void equal(double a,double b)
	{
	    
	    //converting method in double to string
	        String x=Double.toString(a);
            String y=Double.toString(b);
        
        //comparing both the string values using compareTo method
            if(x.equals(y))
    		{
    			System.out.println("equal");
    		}
    		else{
    			System.out.println("Not equal");
    		}
		
	    
	   
}

	
}