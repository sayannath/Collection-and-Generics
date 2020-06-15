package Array;

import java.util.Scanner;

public class questionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size :: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        moveElements(arr, n);
    }
    static void moveElements(int[] a, int n) {
        int temp, j=0;
        for(int i=0; i<n; i++) {
            if (a[i]<0) {
                if(i !=j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
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