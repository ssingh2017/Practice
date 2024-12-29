package org.example.stackProblems;

import java.util.Stack;

public class ValidParanthese {
    public static void main(String [] args){
        String s = "}";
        System.out.println( "Is string valid "+isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == '}'){
                if(!stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            }
            if(s.charAt(i) == ']'){
                if(!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            }
            if(s.charAt(i) == ')'){
                if(!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
