interface A{
    void display();
}
interface B{
    void display();
}
class demo implements A,B{
  public  void display()
    {
        System.out.println("for A and B");
    }
}
class Demo_interface
{
    public static void main(String[] args) {
        demo d = new demo();
        d.display();
    }
}