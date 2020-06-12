package GeeksForGeeks;

import java.io.*;

public class arrayRotationOne {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];

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

    void rotation(int[] arr, int d, int x) {
        d = d % x;
        int i, j, k, temp;
        int g_c_d = gcd(d, x);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= x)
                    k = k - x;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        for (int a = 0; a < x; a++)
            System.out.print(arr[a] + " ");
    }
}
