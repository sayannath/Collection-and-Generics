package LinkedList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class programTwo {
    public static void main(String args[])throws IOException {

        LinkedList<Integer> ll = new LinkedList<>();
        ArrayList<Integer> al = new ArrayList<>();

        getTime(al);
        getTime(ll);

    }

    static void getTime(List<Integer> list) {

        long start = System.currentTimeMillis();

        for(int i=1; i<100000; i++)
            list.add(0, i);

        long end = System.currentTimeMillis();

        System.out.println(list.getClass().getName() + "    ------->    "+ (end-start));
    }


}
