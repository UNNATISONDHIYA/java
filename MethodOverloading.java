class Addition
{
    void sum (int a,int b)
    {
        System.out.println(a+b);
    }
    void sum (int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    void sum(double a,double b)
    {
        System.out.println(a+b);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.sum(3,5);
        a.sum(7.5,9.1);
        a.sum(4,8,7);
    }
    
}
