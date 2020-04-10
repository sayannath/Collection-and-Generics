package Stack;

import java.util.*;

public class programOne {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.println(stack.empty());
        System.out.print("Enter the string :: ");
        String s = sc.nextLine();
        int l = s.length();

        for (int i = 0; i<l; i++) {
            char z = s.charAt(i);
            if(z == '(' || z =='{' || z =='[' ) {
                stack.push(z);
                System.out.println(stack);

            }
            else {
                int x = stack.peek();
                if (x == ')' || x == '}' || x == ']')
                    stack.pop();
            }
        }// For Loop
        if(stack.empty() == true)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
