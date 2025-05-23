import java.util.ArrayList;
import java.util.Collections;
class UseOfArraylist
{
    public static void main(String[] args) {
        // ArrayList<String> arr = new ArrayList<>();
        // arr.add("rahul");
        // arr.add("mohit");
        // arr.add("rohit");
        // arr.add(0,"ram");
        // arr.remove(1);
        // System.out.println(arr);
        // System.out.println(arr.get(0));
        // arr.set(2,"amit");
        // System.err.println(arr);
        // arr.clear();
        // System.out.println(arr);

         ArrayList<Integer> arr = new ArrayList<>();
        // for(int i=1;i<=10;i++)
        // {
        //     arr.add(i*2);
        // }
        // for(int i=0;i<arr.size();i++)
        // {
        // System.out.println(arr.get(i));
        // }
        arr.add(12);
        arr.add(3);
        arr.add(54);
        arr.add(6);
        arr.add(1);
        Collections.sort(arr);
        System.out.println(arr);

    }
}
