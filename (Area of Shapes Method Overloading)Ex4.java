import java.util.*;

class Overload{
    void area(int a, int b)    {
        System.out.println("The area of rectangle is "+a*b+" sq units");
    }
     void area(int a)    {
        System.out.println("The area of Square is "+a*a+" sq units");
    }
    void area(double a)    {
        System.out.println("The area of Circle is "+3.1415936535*a*a+" sq units");
    }
    void area(double a, int b)    {
        System.out.println("The area of Triangle is "+a*b*0.5+" sq units");
    }
}

class Calculate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Overload o = new Overload();
        System.out.print("Enter Length of Rectangle: ");
        int a = s.nextInt();
        System.out.print("Enter Breadth of Rectangle: ");
        int b = s.nextInt();
        System.out.print("Enter Sides of Square: ");
        int c = s.nextInt();
        System.out.print("Enter Radius of Circle: ");
        double d = s.nextDouble();
        System.out.print("Enter Height of Triangle: ");
        double e = s.nextDouble();
        System.out.print("Enter Base of Triangle: ");
        int f = s.nextInt();
            o.area(a,b);
            o.area(c);
            o.area(d);
            o.area(e,f);
    }
}
