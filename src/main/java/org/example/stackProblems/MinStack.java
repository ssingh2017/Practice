package org.example.stackProblems;

import java.util.*;

public class MinStack {
    Stack<Integer> st;

    SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
    SortedSet<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(-2);
        minStack.push(-3);
        minStack.push(-3);
        System.out.println("Minimum value " + minStack.getMin());
        minStack.pop();
        // System.out.println("top "+minStack.top()); // return 2
        System.out.println("Minimum value " + minStack.getMin());// return 1
    }

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        // set.add(val);
        if (sortedMap.containsKey(val)) {
            int count = sortedMap.get(val);
            sortedMap.put(val, ++count);
        } else
            sortedMap.put(val, 1);

    }

    public void pop() {
        set.remove(st.peek());
        if (sortedMap.get(st.peek()) > 1) {
            int count = sortedMap.get(st.peek());
            sortedMap.put(st.peek(), --count);
        } else
            sortedMap.remove(st.peek());

        st.pop();

    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return sortedMap.firstKey();
    }
}
