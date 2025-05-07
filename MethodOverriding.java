class Parent
{
    void eat()
    {
        System.out.println("Maggie");
    }
}
class Child extends Parent 
{
    void eat()
    {
        System.out.println("Pastaa");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.eat();
        
    }
}
