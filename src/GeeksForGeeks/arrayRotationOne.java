package GeeksForGeeks;

import java.io.*;

public class arrayRotationOne {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of elements :: ");
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        System.out.print("Enter the elements :: ");
        for(int i=0;i<n;i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        arrayRotationOne obj = new arrayRotationOne();
        obj.rotation(A, 2, n);
    }

    int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    void rotation(int[] arr, int d, int n) {
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        System.out.println("OUTPUT is");
        for (int a = 0; a < n; a++)
            System.out.print(arr[a] + " ");
    }
}
