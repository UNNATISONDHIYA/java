interface vehicle
{
   default void start(){
    System.out.println("vehicle is starting....");
   }
}
class car implements vehicle{

}
public class Interface_q5 {
    public static void main(String[] args) {
        car c = new car();
        c.start();
    }
    
}
