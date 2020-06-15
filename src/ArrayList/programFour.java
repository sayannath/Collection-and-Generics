package ArrayList;// Implementing different methods of arrayList

import java.io.*;
import java.util.*;

public class programFour {
    public static void main(String args[])throws IOException {
        ArrayList<Integer> x = new ArrayList<>();

        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        x.add(50);

        ArrayList<Integer> y = new ArrayList<>();

        y.add(60);
        y.add(70);
        y.add(80);
        y.add(90);
        y.add(100);

        System.out.println("Printing Array.questionTwo.Array List X");
        System.out.println(x);
        System.out.println("Printing Array.questionTwo.Array List Y");
        System.out.println(y);

        System.out.println("Append two Collections");
        x.addAll(y);
        System.out.println(x);

        System.out.println("Accessing different elements in the Collection");
        System.out.println(x.get(2)); //It will access the third element.

        //To set a particular element in a particular position.
        x.set(2,420);
        System.out.println(x);

        x.remove(2); //To remove particular element from the list.
        System.out.println(x);

        y.clear(); //To clear the ArrayList.
        System.out.println(y);

        List<Integer> toRemove = new ArrayList<>();
        toRemove.add(10);
        toRemove.add(20);

        x.removeAll(toRemove); //To remove the element from a sub list.
        System.out.println(x);

        System.out.println(x.size()); //It returns the size of the array List.

        System.out.println(x.contains(100)); //It checks whether it is present or not.
        System.out.println(x.contains(10));

        System.out.println(x.isEmpty()); //It checks whether the List is empty or not.
        System.out.println(y.isEmpty()); //It checks whether the List is empty or not.

    }
}