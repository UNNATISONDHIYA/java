import java.util.TreeSet;
public class RemoveDuplicateUsingSet {
    public static void main(String[] args) {
        int[] arr = {1,2,2,42,4,5,3,53,45,3,5};
        TreeSet<Integer> set = new TreeSet<>();
        // for(int i=0;i<arr.length;i++)
        //   {
        //      set.add(arr[i]);
        //   }
        // System.out.println("Treeset:" +set);
        // set.add(1);
        // set.add(2);
        // set.add(2);
        // set.add(42);
        // set.add(4);
        // set.add(5);
        // set.add(3);
        // set.add(53);
        // set.add(45);
        // set.add(3);
        // set.add(5);
        // System.out.println(set);
        for(int i : arr)
        {
            if(set.contains(i))
            {
                System.out.println(i);
                break;
            }
            set.add(i);
        }  
        System.out.println(set);
             

        
    }
    
}
