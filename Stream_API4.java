import java.util.*;
import java.util.stream.*;
class Stram_API4
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ram","Shyam","OM","Sita");
        List<String> result = list.stream()
                                  .filter(name->name.length()>3) 
                                  .map(String::toUpperCase) 
                                  .collect(Collectors.toList());
        System.out.println(result);                            
    }
}