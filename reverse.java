import java.util.Scanner;
public class reverse {
  public static void main(String[] args) {
      System.out.println("enter a number:");
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int d,r=0;
      while(n!=0)
      {   
        d=n%10;
        r=r*10+d;
        n/=10;
      }
      System.out.println("Reversed Number:" +(r));
  }  
}
