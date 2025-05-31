import java.util.*;
public class FirstNonRepeatingChar {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = s.nextLine();
 Map<Character, Integer> map = new LinkedHashMap<>();
 for (char ch : str.toCharArray()) {
 map.put(ch, map.getOrDefault(ch, 0) + 1);
 }
 for (Map.Entry<Character, Integer> entry : map.entrySet()) {
 if (entry.getValue() == 1) {
 System.out.println("First Non-Repeating Character: " + entry.getKey());
 break;
 }
 }
 }
}
