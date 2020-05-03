package InterviewQuestions;
import java.util.*;
import java.io.*;

public class questionOne {
    public static void main(String args[])throws IOException {
        int c;
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        while(c != 0) {
            int n = sc.nextInt();
            String[] item = new String[n];
            int[] price = new int[n];
            for (int i=0; i<n; i++) {
                item[i] = sc.nextLine();
                price[i] = sc.nextInt();
            }
        }
    }
}
