package org.example.stackProblems;

import java.util.Stack;

public class ReverseStackByRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    private static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty())
             return;

        int temp = stack.pop();
        reverseStack(stack);
        insertToStack(stack,temp);
    }
    private static void insertToStack(Stack<Integer> stack, int temp){
        if(stack.isEmpty()){
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insertToStack(stack,temp);
        stack.push(val);
    }
}
