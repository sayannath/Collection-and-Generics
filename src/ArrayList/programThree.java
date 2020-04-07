package ArrayList;

import ArrayList.Pair.Pair;

import java.io.IOException;
public class programThree {
    public static void main(String args[])throws IOException {
        Pair<String, Integer> p1 = new Pair("Sayan", 235);
        Pair<Boolean, Float> p2 = new Pair(true, 0.0);

        p1.getDescription();
        p2.getDescription();
    }
}
