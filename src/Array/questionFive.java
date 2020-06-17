/*
Find the Union and Intersection of the two sorted arrays.
 */
package Array;

import java.util.*;
public class questionFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        int[] b = {2,3,7,8,9,10,5};
        int i=0, j=0;
        int m = a.length;
        int n = b.length;
        while(i<m && j<n){

            if(a[i] > b[j]) {
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else {
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }
}
