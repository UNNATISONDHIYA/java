class Different_Shapes
{
    void calculateArea(double r)
    {
        System.out.println("Area of Circle:" +(3.14*r*r));
    }
    void calculateArea(int l,int b)
    {
        System.out.println("Area of rectangle:" +(l*b));
    }
    void calculateArea(int a)
    {
        System.out.println("Area of square:" +(a*a));
    }
    void calculateArea(double b,double h)
    {
        System.out.println("Area of Triangle:" +(0.5*b*h));
    }
}
public class Area {
    public static void main(String[] args) {
        Different_Shapes obj = new Different_Shapes();
        obj.calculateArea(2.5);
        obj.calculateArea(4,6);
        obj.calculateArea(4);
        obj.calculateArea(2.2, 3.5);
    }

    
}
