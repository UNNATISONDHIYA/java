import java.util.*;
public class WordFrequency {
 public static void main(String[] args) {
 String sentence = "java is fun and java is powerful";
 String[] words = sentence.split(" ");
 Map<String, Integer> freqMap = new HashMap<>();
 for (String word : words) {
 freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
 }
 System.out.println("Word Frequencies: " + freqMap);
 }
}