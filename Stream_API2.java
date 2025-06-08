import java.util.Arrays;
import java.util.List;

public class Stream_API2 {
    public static void main(String[] args) {
        //MAXIMUM NUMBER
        List<Integer> list = Arrays.asList(4,6,8,12,60);
        int max = list.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
        System.out.println("Maximum Number:"+max);

        //MINIMUM NUMBER
       // List<Integer> list = Arrays.asList(4,6,8,12,60);
        int min = list.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
        System.out.println("Maximum Number:"+min);


    }
    
}