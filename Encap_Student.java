

class student 
{
    private String n ;
    private int m;
    public void setDetails(String n,int m)
    {
        this.n=n;
        this.m=m;
    }
    public String getname()
    {
        return n;
    }

    public int getmarks()
    {
        return m;
    }
    public void printDetails()
    {
        System.out.println("Student Details:");
        System.err.println("Name:" +n);
        System.out.println("Marks:" +m);
    }

}
public class Encap_Student {
    public static void main(String[] args) {
        student s = new student();
        s.setDetails("Raju", 90);
        System.out.println(s.getname());
        System.out.println(s.getmarks());
        s.printDetails();
    }
    
}
