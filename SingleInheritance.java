class Animal
{
    void eat()
    {
        System.out.println("Eat");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("Bark");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
        obj.bark();
        
    }
    
}
