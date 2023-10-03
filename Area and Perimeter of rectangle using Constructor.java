import java.util.Scanner;

class Rectangle
{
	private double length;     
	private double width;
	
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}	
	public double CalculateArea()
	{
		return length*width;
	}
	public double CalculatePerimeter()
	{
		return 2*(length+width);
	}
}

public class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the length of the rectangle = "); 
		double length = sc.nextDouble();          
		System.out.print("Enter the width = ");
		double width = sc.nextDouble();
		Rectangle rectangle = new Rectangle (length,width);
		double area = rectangle.CalculateArea();
		double perimeter = rectangle.CalculatePerimeter();
	System.out.println("Area of Rectangle = "+area);         
        System.out.println("Perimeter of Rectangle = "+perimeter);
      
		

		
	}	
}		
	
