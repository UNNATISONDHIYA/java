interface Animal{
    void makeSound();
}
class Dog implements Animal{
    public void makeSound()
    {
       System.out.println("Bark"); 
    }
}
public class Interface_q3 {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.makeSound();
    }
    
}
