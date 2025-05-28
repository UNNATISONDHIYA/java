import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("id0",1);
        map.put("id1",2);
        map.put("id2",3);
        System.out.println(map);
        System.out.println(map.get("id3"));
        System.out.println(map.containsKey("id0"));
        System.out.println(map.containsValue(3));
       // map.remove("id0");
        System.out.println(map);
        for(String key : map.keySet())
        {
            System.out.println(key);
        }
        map.forEach((key,value) -> 
        {
            System.out.println(key + " " + value);
        });
        
    }
    
}
