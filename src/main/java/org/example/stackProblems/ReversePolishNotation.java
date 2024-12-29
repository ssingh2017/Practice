package org.example.stackProblems;

import java.util.Stack;


public class ReversePolishNotation {
    public static void main(String [] args){
        String [] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(" the result is "+evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            //String s = tokens[i];
            int endValue =0;
            int startValue =0;
            int result = 0;
            switch (s){

                case "+":
                    startValue = stack.pop();
                     endValue = stack.pop();
                     result =  endValue +startValue;
                    stack.push(result);
                    break;

                case "-":
                    startValue = stack.pop();
                    endValue = stack.pop();
                     result =  endValue - startValue;
                    stack.push(result);
                    break;
                case "*":
                    startValue = stack.pop();
                    endValue = stack.pop();
                    result =  endValue * startValue;
                    stack.push(result);
                    break;
                case "/":
                    startValue = stack.pop();
                    endValue = stack.pop();
                    result =  endValue / startValue;
                    stack.push(result);
                    break;
                default:
                    stack.push(Integer.parseInt(s));
            }

        }
        return stack.pop();
    }
}
