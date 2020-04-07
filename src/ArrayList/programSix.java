package ArrayList;
//Google and Microsoft Interview Question

import java.util.*;
public class programSix {
    public static void main(String args[]) {
        ArrayList<Integer> A = new ArrayList<>();

        A.add(9);
        A.add(9);
        A.add(9);
        A.add(9);
        A.add(9);
        A.add(9);

        int sum = 0;
        for(int i= 0;i<A.size();i++){
            sum += A.get(i);
        }
        int x = A.get(A.size()-1) + 1;
        A.set(A.size()-1, x);
        System.out.println(A);
    }
}
