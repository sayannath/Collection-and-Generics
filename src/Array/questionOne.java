/*
Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algorithm.
 */

package Array;

import java.util.Scanner;

public class questionOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements :: ");
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        sortElements(arr, n);
    }
    static void sortElements(int[] a, int n) {
        int low=0;
        int high=n-1;
        int mid=0;
        int temp=0;
        while(mid <= high) {
            switch (a[mid]) {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            }
        }
        System.out.println("The sorted array");
        for (int i=0; i<n; i++)
            System.out.print(a[i]+"    ");
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)
 */
