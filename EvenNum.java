import java.util.Scanner;
public class EvenNum {
    public static void PrintEvenNum(int a,int b)
    {
        for(int i=a;i<=b;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
        

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter starting range(a):");
        int a=obj.nextInt();
        System.out.println("Enter ending range(b):");
        int b=obj.nextInt();
        System.out.println("Even numbers from a to b:");
        PrintEvenNum(a,b);
    }
    
}

