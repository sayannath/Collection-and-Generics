package CodeChef;

import java.io.*;
import java.util.ArrayList;

public class digitChecker {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isCheck = true;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0;i<100;i++){
            int num = Integer.parseInt(br.readLine());
            if((100-num)<2)
                break;
            else
                arrayList.add(num);
        }
        for (int i=0;i<arrayList.size();i++) {
            if(arrayList.get(i) == 42) {
                break;
            }
            else {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
