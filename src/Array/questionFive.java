/*
Find the Union and Intersection of the two sorted arrays.
 */
package Array;

import java.util.*;
public class questionFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        int[] b = {2,3,6,78,9};
        int[] c = new int[b.length];
        int x=0;
        int m = a.length;
        int n = b.length;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(a[i] == b[j])
                    c[x++] = a[i];
            }
        }
        for (int i =0; i<c.length; i++) {
            if (c[i] != 0)
                System.out.print(c[i] + " ");
        }
    }
}
