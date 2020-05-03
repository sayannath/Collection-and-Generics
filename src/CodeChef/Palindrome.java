package CodeChef;

import java.io.*;
import java.util.ArrayList;

public class Palindrome {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Palindrome check = new Palindrome();
        //System.out.print("Enter the number of test cases :: ");
        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        while(t !=0){
            //System.out.print("Enter the number :: ");
            int num = Integer.parseInt(br.readLine());
            int x = check.reverse(num);
            arrayList.add(x);
            t--;
        }
        for (int i=0; i<arrayList.size(); i++)
            System.out.println(arrayList.get(i));
    }
    int reverse(int x){
        int d,rev=0;
        while (x!=0) {
            d = x%10;
            x = x/10;
            rev = rev*10 + d;
        }
        return rev;
    }
}
