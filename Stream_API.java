
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Stream_API {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,15,20,25);

        List<Integer> evenlist = list.stream()
                                     .filter(n->n%2==0)            //condition loop + condition = filter
                                     .collect(Collectors.toList()); 

        System.out.println(evenlist);                             
                                    
                                    
                                    
                                    
                                    
}
    
}
