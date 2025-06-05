

class withdrawal extends Thread{
    static int totalBalance = 1000;
    int amount;
    public withdrawal (int amount)
    {
        this.amount = amount;
    }
    public void run()
    {
        synchronized (withdrawal.class) {
        if(totalBalance>=amount){
          System.out.println("is going to withdrawal"+" " +amount);
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
          }
          totalBalance-=amount;
          System.out.println("Remaining Amount:"+" "+ totalBalance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}
}
public class MultiThread4 {
    public static void main(String[] args) {
        withdrawal t1 = new withdrawal(800);
        withdrawal t2 = new withdrawal(500);
        t1.start();
        t2.start();
    }
    
}
