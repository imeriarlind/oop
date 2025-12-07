package session16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Nje");
        map.put(2, "Dy");
        map.put(3, "Tre");
        System.out.println("Get 1: "+map.get(1));

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }

        map.keySet().stream().forEach(System.out::println);

        System.out.println(map.values());
    }
}
