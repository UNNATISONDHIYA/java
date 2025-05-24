import java.util.ArrayList;
public class fFindMaxsumOfPair {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(-7);
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(-3);
        arr.add(0);
        arr.add(1);
        System.out.println(arr);
        int sum=0,currentsum=0;
        for(int i=0;i<arr.size();i++)
        {
            sum=sum+arr.get(i);
            if(sum>currentsum)
            {
                currentsum=sum;
                
            }
            else{
                sum=sum-arr.get(i);
                arr.remove(i);
            }
        }
        System.err.println(currentsum);
        System.out.println(arr);
    }
    
}
