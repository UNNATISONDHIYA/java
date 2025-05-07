class Parent{
    void print()
    {
        System.out.println("this is parent class");
    }
}
class Intermidiate extends Parent {
    void display()
    {
        System.out.println("this is intermidiate class");
    }
}
class child extends Intermidiate {
    void show()
    {
        System.out.println("this is child class");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        child obj = new child();
        obj.print();
        obj.display();
        obj.show();

        
    }
    
}
