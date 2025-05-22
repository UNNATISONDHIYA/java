interface walkable
{
    void walk();
}
interface runnable
{
    void run();
}
class Human implements walkable,runnable {
    public void walk()
    {
        System.out.println("for walkable");
    }
    public void run()
    {
        System.out.println("for runnable");
    }
}
class Interface_human{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.walk();
        obj.run();
    }
    
}
