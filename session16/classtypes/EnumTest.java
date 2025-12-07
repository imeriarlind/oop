package session16.classtypes;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        Arrays.stream(Colour.values()).forEach(System.out::println);
    }
}
