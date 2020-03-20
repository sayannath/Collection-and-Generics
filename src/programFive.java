
// Implementing toArray() method.

import java.util.*;
public class programFive {
    public static void main(String args[]) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Guava");

        String temp[] = new String[fruits.size()];

        fruits.toArray(temp);

        for (String i:
             temp) {
            System.out.println(i);
        }

    }
}
