class MyThread extends Thread{
    public void run(){
        System.out.println("Hello");
        try {
           Thread.sleep(5000) ;
        } catch (Exception e) {
        }
            System.out.println("Hii");
    }
}
public class Multithreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("byee");
        }
       // System.out.println("Hii");
        
    }
    
}
