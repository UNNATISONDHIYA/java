interface shape
{
    double area();
}
class circle implements shape{
    public double area()
    {
        int r = 5;
        return 3.14*r*r;
    }
}
public class Interface_q4 {
    public static void main(String[] args) {
        circle c = new circle();
        System.out.println("Area of Circle:" +c.area());
    }
    
}
