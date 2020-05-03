package ArrayList;

public class twoPointer {
    public static void main(String args[]) {
        int target = 9;
        int[] num = {2,7,11,15};

        int a = 0;
        int b = num.length - 1;

        while(a <=b) {
            int sum = num[a] + num[b];

            if(sum > target) {
                b -= 1;
            } if (sum < target) {
                a += 1;
            } else {
                System.out.println((a+1)+"  "+(b+1));
            }
        }
        System.out.println((a+1)+"  "+(b+1));
    }
}
