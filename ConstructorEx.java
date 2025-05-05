class Student{
    String name="Rohit";
    int age=19;
    Student(String name,int age){
        System.out.println(name+" "+age);

    }
    void display(){
        System.out.println("Hello");
    }
}
public class ConstructorEx {
    public static void main(String[] args) {
        Student obj = new Student("Rahul",18);
        obj.display();
        System.out.println(obj.name);
    }
    
}
