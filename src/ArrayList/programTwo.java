package ArrayList;

import java.util.*;
import java.io.*;

public class programTwo {
    public static void main(String args[])throws IOException {

        int n = 5;

        ArrayList<Integer> arrayList = new ArrayList<>(n);

        //Adding the elements in the collections.
        for(int i = 1; i<n; i++)
            arrayList.add(i);

        //Before Sorting.
        System.out.print(arrayList);
        System.out.println();

        //Sorting in ascending Order.
        Collections.sort(arrayList);
        System.out.print(arrayList);
        System.out.println();


        //Sorting in Descending Order.
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.print(arrayList);
        System.out.println();


    }
}