import java.util.*;
class Student implements Comparable<Student>{
    int age;
    String name;
    Student(int age , String name)
    {
        this.age=age;
        this.name=name;
    }
 public String toString(){
    return age+" "+name;
 }  
 public int compareTo(Student s){
    return this.age-s.age;
 }
}
public class CollectionFramework1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(21,"Ayush"));
        list.add(new Student(20,"khushi"));
        list.add(new Student(20,"Avni"));
        list.add(new Student(19, "Unnati"));
        
        Collections.sort(list);
        for(Student s : list)
        System.out.println(s.toString());
        
    }
    
}
