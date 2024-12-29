package org.example.stackProblems;

import java.util.Stack;

public class DailyTemperatures {
    public static void main(String [] args){
        int [] temperatures = {30,40,50,60};
        int [] res = dailyTemperatures(temperatures);

        for(int num: res)
            System.out.print(num +" ");
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int length = temperatures.length;
        int [] res = new int [length];

        int i=0;
        while(i<length){
            if(!st.isEmpty()) {
                //int pos = st.peek();
                while ( !st.isEmpty() && temperatures[i] > temperatures[st.peek()] ) {
                   int pos = st.pop();
                    res[pos] = i - pos;
//                    if(!st.isEmpty())
//                        pos = st.peek();
                }
            }

            st.push(i);
            ++i;
           // System.out.println("stack "+st + " i "+i);
        }
        while(!st.isEmpty()){
            res[st.pop()] = 0;
        }
        return res;
    }
}
