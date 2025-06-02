import java.util.*;
 class Student{
int rollno;
String name;
int age;
Student(int rollno,String name,int age){
    this.rollno=rollno;
    this.name=name;
    this.age=age;
}
public String toString()
{
    return name+" "+age+" "+rollno;
}
}
class SortByName implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return s1.name.compareTo(s2.name);
    }
}
class SortByRollN implements Comparator<Student>
{
    public int compare(Student s1,Student s2)
    {
        return s1.rollno-s2.rollno;
    }
}
public class CollectionFramework2 {
    public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();
    list.add(new Student(12,"Avni", 20));
    list.add(new Student(123,"Unnati", 19));
    list.add(new Student(23,"Khushi",23));
    list.add(new Student(32,"Ayushi",22));
    System.out.println("Lets sort it by Name:");
    Collections.sort(list, new SortByName());
    for(Student s: list){
        System.out.println(s);
    }
     System.out.println("Now, let sort it by Roll no:");
    Collections.sort(list, new SortByRollN());
    for(Student s: list){
        System.out.println(s);
    }
    }
}
