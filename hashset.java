import java.util.HashSet;
import java.util.TreeSet;
public class hashset {
    public static void main(String[] args) {        //set duplicate data print nahi karta hai
        HashSet<String> set = new HashSet<>();
        TreeSet<String> s = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        s.add("C");
        s.add("B");
        s.add("a");
        System.out.println(set);
        System.out.println(s);
    }
    
}
