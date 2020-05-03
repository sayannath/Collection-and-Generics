package CodeChef;

import java.io.*;
import java.util.ArrayList;

public class digitChecker {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<100;i++){
            int num = Integer.parseInt(br.readLine());
            if((100-num)<2)
                break;
            else
                arrayList.add(num);
        }
        for (Integer integer : arrayList) {
            if (integer == 42) {
                break;
            } else {
                System.out.println(integer);
            }
        }
    }
}
