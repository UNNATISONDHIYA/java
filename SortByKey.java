//Sort by Key
import java.util.*;
public class SortByKey {
 public static void main(String[] args) {
 Map<String, Integer> map = new HashMap<>();
 map.put("Banana", 10);
 map.put("Apple", 30);
 map.put("Mango", 20);
 Map<String, Integer> treeMap = new TreeMap<>(map);
 System.out.println("Sorted by Keys: " + treeMap);
 }
}

