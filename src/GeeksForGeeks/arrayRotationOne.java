package GeeksForGeeks;

import java.io.*;

public class arrayRotationOne {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of test-cases :: ");
        int t = Integer.parseInt(br.readLine());
        while(t!=0){
            System.out.print("Enter the number of elements :: ");
            int n = Integer.parseInt(br.readLine());
            System.out.print("Enter the elements ::");
            int[] arr = new int[n];
            for(int i=0; i<n;i++)
                arr[i] = Integer.parseInt(br.readLine());
            System.out.print("Enter the number of rotations you want :: ");
            int d = Integer.parseInt(br.readLine());
            arrayRotationOne obj = new arrayRotationOne();
            obj.rotateByOne(arr, d, n);
            t--;
        }
    }

    void rotateByOne(int a[], int d, int n) {
        for (int x = 0; x < d; x++) {
            int i, temp;
            temp = a[0];
            for (i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            a[i] = temp;
        }
        System.out.println("Modified Array is :: ");
        for (int i=0; i<n; i++)
            System.out.print(a[i]+" ");
    }
}
