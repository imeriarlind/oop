package session16;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector <String> v = new Vector<>(5, 3);
        v.add("Nje");
        v.add("Dy");
        v.add("Tre");
        v.add("Kater");
        v.add("Pese");
        v.add("Gjashte");
        System.out.printf("Capacity = %d, size = %d%n", v.capacity(), v.size());
        String value = "Dy";
        System.out.printf("%s gjendet ne poziten %d%n", value, v.indexOf(value));
        System.out.printf("%s ekziston ne vector: %b%n", value, v.contains(value));
        System.out.println(v);

        String [] values = new String[v.size()];
        values = v.toArray(values);
        System.out.println(Arrays.toString(values));

//        for (String val : v) {
//            System.out.println(val);
//        }

        v.stream().forEach(System.out::println);
        List<String> newList = v.stream().filter(s -> s.length() <= 3).toList();
        System.out.println(newList);

        List<Integer> list = v.stream().filter(s -> s.length() > 3).map(s -> s.length()).toList();
        System.out.println(list);
    }
}
