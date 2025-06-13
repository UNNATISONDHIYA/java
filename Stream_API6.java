import java.util.*;
import java.util.stream.*;
public class Stream_API6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java","Stream","API");
        List<Integer> length = list.stream()
                                   .map(String::length)
                                   .collect(Collectors.toList());
        System.out.println(length);                           
    }


    
}
