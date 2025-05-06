class Student{
    Student()
    {
        System.out.println("Hello!!");
    }
    Student(int a)
    {
        this();
        System.out.println(a);
    }
    Student(int a,int b)
    {
        this(5);
        System.out.println(a+b);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        Student obj = new Student(4,5);
    }
    
}
