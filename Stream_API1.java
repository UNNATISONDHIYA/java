import java.util.Arrays;
import java.util.List;

public class Stream_API1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,10,15,20,25);
       // Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
        int sum = list.stream().reduce(10,(a,b)->a+b);
        System.out.println(sum);
    }
    
}
