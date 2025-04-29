import java.util.Scanner;

public class BinarySearch {
    public static int BSearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        for(int i=0;i<arr.length;i++)
        {
           int  mid = start+end/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else {
                if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
         System.out.println("Enter size of an array:");
         int n = obj.nextInt();
         System.out.println("Enter elements of array in sorted manner:");
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=obj.nextInt();
         }
         System.out.println("enter target value:");
         int t = obj.nextInt();
         int result=BSearch(arr,t);
         if(result==-1)
         {
            System.out.println("Element not found");
         }
         else{
            System.out.println("Element found at index:" + result);
         }

    }
    
}
