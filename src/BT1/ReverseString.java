package BT1;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "54321";
        Stack<Character> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String result="";
        for(int i=0;i<str.length();i++){
            result+=stack.pop();
        }
        System.out.println(result);

    }
}
