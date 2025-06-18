//Return a comma separated string of all names with more than 4 letters
import java.util.*;
import java.util.stream.*;
public class Stream_API9 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Ravi","John","Abhishek","Raj");
        String result = name.stream()
                            .filter(n->n.length()>4)
                            .collect(Collectors.joining(","));
        System.out.println(result);                    
    }                                
    
}
