// Java program to illistrate
// Java.util.HashMap
import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        print(map);
        map.put("bob", 10);
        map.put("joe", 30);
        map.put("susan", 20);

        System.out.println("Size of map is: " + map.size());

        print(map);
        if (map.containsKey("bob")) {
            Integer a = map.get("bob");
            System.out.println("value for key 'bob' is: " + a);
        }
        map.clear();
        print(map);
    }

    public static void print(Map<String, Integer> map) {
        if (map.isEmpty()) {
            System.out.println("map is empty");
        }
        else {
            System.out.println(map);
        }
    }
}