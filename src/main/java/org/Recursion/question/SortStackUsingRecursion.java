package org.Recursion.question;

import java.util.Stack;

public class SortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(6);
        stack.push(2);
        sort(stack);

        printStack(stack);

    }

    private static void printStack(Stack<Integer> stack){
        if(stack.isEmpty())
            return;

        int val = stack.pop();
        printStack(stack);
        System.out.print(val +" ");
    }

    private static void sort(Stack<Integer> stack){
        if (stack.size() == 1)
            return;
        int temp = stack.pop();
        sort(stack);
        insertInToStack(stack, temp);
    }

    private static void insertInToStack(Stack<Integer> stack,int temp){
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }
        int tmp = stack.pop();
        insertInToStack(stack, temp);
        stack.push(tmp);
    }

}
