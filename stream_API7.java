//from a list of prices remove duplicates,filter prices above 1000 and return total sum.
import java.util.*;
public class stream_API7 {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(999,1000,1500,1000,2000);
        int total = prices.stream()
                          .distinct()
                          .filter(price->price>1000)
                          .reduce(0,Integer::sum);
        System.out.println(total);                  
    }
    
}
