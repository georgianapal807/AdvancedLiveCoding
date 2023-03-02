package e28;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArraySkipper<String> array = new ArraySkipper<>(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"));
        System.out.println(array.getEveryNthElement(2, 1));

        ArraySkipper<Integer> array2 = new ArraySkipper<>(List.of(1, 2, 3, 4, 5));
        System.out.println(array2.partOf(1) + "%");
    }
}