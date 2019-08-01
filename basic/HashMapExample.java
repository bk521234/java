import java.util.*;

public class HashMapExample {
    public static void main(String args[]) {
        // create and populate hash map
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "PHP");
        map.put(4, "SQL");
        map.put(5, "C++");

        System.out.println("Tutorial: " + map);

        // remove value of key 5
        map.remove(5);
        System.out.println("Tutorial After Remove: " + map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.isEmpty());
    }
}
