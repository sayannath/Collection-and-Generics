/*
Find all pairs on integer array whose sum is equal to given number.
 */

package Array;

import java.io.*;
import java.util.Scanner;

public class questionFour {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int count=0;
        System.out.println("Enter the sum");
        int sum = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n ;j++) {
                if((arr[i] + arr[j]) == sum)
                    count++;
            }
        }
        System.out.println(count+" ");
    }
}
