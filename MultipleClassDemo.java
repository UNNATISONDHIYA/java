class student
{
    String FirstName="Avni";
    String LastName="Diwan";
    void FullName()
    {
        System.out.println(FirstName+ " " +LastName);
    }
}
public class MultipleClassDemo {
    public static void main(String[] args) {
        student obj = new student();
        obj.FullName();

    }
    
}
