package org.Recursion.question;

import java.util.Stack;

public class DeleteMiddleElementFromStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(6);
        stack.push(2);
        stack.push(10);

        int middlePosition = stack.size()/2+1;
        deleteMiddleElement(stack,middlePosition);
        printStack(stack);
    }

    private static void printStack(Stack<Integer> stack){
        if(stack.isEmpty())
            return;

        int val = stack.pop();
        System.out.print(val +" ");
        printStack(stack);

    }

    private static void deleteMiddleElement(Stack<Integer> stack,int middlePosition){
        if(1 == middlePosition){
            stack.pop();
            return;
        }
        int val = stack.pop();
        deleteMiddleElement(stack,middlePosition-1);
        stack.push(val);
    }
}
