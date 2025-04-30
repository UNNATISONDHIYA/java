class rectangle{
    void calculateArea(int l,int b)
    {
        System.out.print("Area of Rectangle:" +l*b);
    }
    void calculateperimeter(int l,int b)
    {
        System.out.print("Perimeter of Rectangle:" +2*(l+b));
    }
}
public class class_obj2 {
   public static void main(String[] args){
    rectangle r = new rectangle();
    r.calculateArea(40,60);
    System.out.println();
    r.calculateperimeter(4, 6);
   }
}
