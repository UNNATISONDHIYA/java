import java.util.*;
public class Stream_API10 {
    public static void main(String[] args) {
         int[] numbers = {10,14,22,30};
         boolean result = Arrays.stream(numbers)
                                .anyMatch(n->n%7==0);
         System.out.println(result);                       
    }
    
}
