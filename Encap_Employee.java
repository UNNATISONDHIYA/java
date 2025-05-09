class Employee{
    private int id;
    private String name;
    private double salary;
    public void setDetails(int id,String name,double salary )
    {  
       this.id=id;
       this.name=name;
       this.salary=salary;
       
    }
    public int getid()
    {
        return id;
    }
    public String getname()
    {
        return name;
    }
    public double getsalary()
    {
        return salary;
    }
    public void display()
    {
        System.out.println("Employee Details....");
        System.out.println("Id:"+id +" " + "Name:"+name+" "  +"Salary:" +salary);
    }

}
public class Encap_Employee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setDetails(1009, "Amit", 10000);
        System.out.println(e.getid());
        System.err.println(e.getname());
        System.out.println(e.getsalary());
        e.display();
        }
}
