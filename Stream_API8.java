//count how many strings in a list start with letter a or A.
import java.util.*;
public class Stream_API8 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","apricot","cherry","Avocado");
        long count = list.stream()
                         .filter(s->s.toLowerCase().startsWith("a"))
                         .count();
        System.out.println(count);                 
    }
    
}
