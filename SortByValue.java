//Sort by Value
import java.util.*;
public class SortByValue {
 public static void main(String[] args) {
 Map<String, Integer> map = new HashMap<>();
 map.put("Banana", 10);
 map.put("Apple", 30);
 map.put("Mango", 20);
 List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
 list.sort(Map.Entry.comparingByValue());
System.out.println("Sorted by Values:");
 for (Map.Entry<String, Integer> entry : list) {
 System.out.println(entry.getKey() + " => " + entry.getValue());
 }
 }
}

