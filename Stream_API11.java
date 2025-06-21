import java.util.*;
public class Stream_API11 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4);
        int result = num.stream()
                        .reduce(1,(a,b)->a*b);
        System.out.println(result);                
    }
    

}
