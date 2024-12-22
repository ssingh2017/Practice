package org.example.SortingAlgo;

public class factorial {
    public static void main(String [] args){
       int x =1;
       rec(x);
        System.out.println(x+"Inside main");
    }

    public static int rec(int x) {
        if(x<5)
        {
            System.out.println("-->Smaller than 5");
            rec(x+1);
            System.out.println("<--After recursion inside x<5");
            return x;
        }
        else if(x<7)
        {
            System.out.println("-->Smaller than 7");
            rec(x+1);
            System.out.println("<--After recursion inside x<7");
        }
        System.out.println("<--No Condition Statement");
        return x;
    }
}
