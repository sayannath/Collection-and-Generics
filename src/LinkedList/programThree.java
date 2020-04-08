package LinkedList;

import java.util.*;

public class programThree {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();

        System.out.println("Enter the elements :: ");
        for (int i = 0; i<5; i++) {
            int num = sc.nextInt();
            ll.add(num);
        }

        System.out.println("Before insertion ---> "+ll);


        int mid = (int)Math.floor(ll.size()/2);
        System.out.println("Enter the element you wan to enter in the middle :: ");
        int midx = sc.nextInt();

        ll.add(mid,midx);
        System.out.println(ll);


    }
}
