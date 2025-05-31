package org.Recursion.question;

public class KthSymbolInGrammar {
    public static void main(String[] args) {
        System.out.println("output: "+kthSymbol(3,2));
    }

    private static Integer kthSymbol(int n, int k){
        if(n==1 && k==1)
            return 0;
        double noOfElement = Math.pow(2,n-1);
        if(k>noOfElement)
            return -1;
        if(k<=noOfElement/2)
            return kthSymbol(n-1,k);
        else
            return kthSymbol(n-1, (int) (k-noOfElement/2))^1;

    }
}
