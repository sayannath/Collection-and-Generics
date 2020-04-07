package ArrayList;

import java.util.*;
import java.io.*;

public class programOne {
    public static void main(String args[])throws IOException {
        int n = 5;
        ArrayList<Integer> arrayList = new ArrayList<>(n);

        for (int i=0; i <= n;i++)
            arrayList.add(i);

        for (int i =0; i<n;i++)
            System.out.print(arrayList.get(i)+" ");
    }
}