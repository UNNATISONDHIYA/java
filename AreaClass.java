class Area{
    int l=2;
    int b=4;
    void calculateArea()
    {
        System.out.println("Area of Rectangle:" +l*b);
    }

}
public class AreaClass {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.calculateArea();
    }
    
}
