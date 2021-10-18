package BT1;

import java.util.Stack;

public class ReverseIntegerArray {
    public static void main(String[] args) {
        int[] integerArray=new int[]{1,2,3,4,5};
        Stack<Integer> stack=new Stack();
        for(int number:integerArray){
            stack.push(number);
        }
        for(int i=0;i<integerArray.length;i++){
            integerArray[i]=stack.pop();
            System.out.println(integerArray[i]);
        }


    }

}
