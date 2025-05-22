interface client1
{
    void show();
}
interface client2
{
    void show();
    void print();
}
class  dev implements  client1,client2
{
    public void show()
        {
          System.out.println("for both");
        }
    public void print()
    {
        System.out.println("for client2");
    }
}
class multipleInheritanceSupportUsingInterface{
    public static void main(String[] args) {
        dev h = new dev();
        h.show();
        h.print();
    }
}
