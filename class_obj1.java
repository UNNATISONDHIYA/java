class Student{
    void display(String name,int rollnumber,int marks)
    {
        System.out.println("Student Name:" +name);
        System.out.println("Student Rollnumber:" +rollnumber);
        System.out.println("Student Marks:" +marks);
    }
}
public class class_obj1 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        System.out.println("Information of First Student:");
        s1.display("Avni", 101, 80);
        System.out.println("Information of Second Student:");
        s2.display("Aarti",102 , 78);
        System.out.println("Information of Third Student:");
        s3.display("Anika", 103, 85);
    }
    
}
