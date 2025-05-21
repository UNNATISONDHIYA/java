interface client{
    void print();
    void show();
}
class Dev implements client{
    public void print()
    {
        System.out.println("Bill");
    }
    public void show()
    {
        System.out.println("Biryanii");
    }
    
}
public class Interface_use {
    public static void main(String[] args) {
        Dev obj = new Dev();
        obj.print();
        obj.show();
        
    }
    
}
