import java.util.ArrayList;
import java.util.Collections;

public class RunnableTraditional {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("rahul");
        list.add("rohit");
        list.add("mohit");
        // Collections.sort(list,new Comparator<String>(){       //old way
        //     public int compare(String a,String b)
        //     {
        //        return a.compareTo(b);
        //     }
        // }
        // );
        Collections.sort(list,(a,b)->a.compareTo(b));            //lembda expression
        System.out.println(list);
        
    }
    
}
