import java.util.Scanner;
public class LSearch {
    public static void LinearSearch(int[] arr, int target)
    {
        int found=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
           System.out.println("founded at index number:" +i);
           found=1;
            }
           
        }
        if(found==0){
            System.out.println("not found");
           }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
       
        System.out.println("Enter size of an array:");
        int n = obj.nextInt();
        System.out.println("Enter elements of array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("enter target value:");
        int t = obj.nextInt();
        LinearSearch(arr,t);
    }
    
}
