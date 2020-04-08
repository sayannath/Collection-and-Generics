package Vector;

import java.util.Vector;

public class programOne {
    public static void main(String args[]) {

        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        System.out.println(v);
        System.out.println(v.getClass().getName());

    }
}
