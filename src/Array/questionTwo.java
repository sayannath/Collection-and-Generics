/*
Find the Kth largest and Kth smallest number in an array.
 */

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class questionTwo {
    public static class Array {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of the array :: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements in the array :: ");
            for (int i=0; i<n; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            System.out.print("Enter the Kth number :: ");
            int k = sc.nextInt();
            System.out.println(arr[k-1]+" is the Kth smallest element.");
            System.out.println(arr[n-k]+" is the Kth largest element.");
        }
    }
}
