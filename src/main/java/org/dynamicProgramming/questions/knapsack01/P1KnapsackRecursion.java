package org.dynamicProgramming.questions.knapsack01;

// 0-1 knapsack recursion solution.

import java.util.Arrays;

public class P1KnapsackRecursion {

    static int[][] t;
     public static void main(String[] args) {
        int [] weight = {4,2,5,3};
        int [] value = {3,5,4,6};
        int n = value.length;
        int w = 10;
        t = new int[n+1][w+1];

        for(int i=0;i<n+1;i++)
            Arrays.fill(t[i],-1);

        System.out.println("Max profit "+knapSack(weight,value,w,4));
    }

    public static int knapSack(int wt[],int value[], int weight, int sizeOfArray){
        if(sizeOfArray == 0 || weight == 0)
            return 0;

        if(t[sizeOfArray][weight]!=-1)
            return t[sizeOfArray][weight];

        if(wt[sizeOfArray-1]<=weight)
            return t[sizeOfArray][weight] =  Math.max(value[sizeOfArray-1] + knapSack(wt,value,weight-wt[sizeOfArray-1],sizeOfArray-1)
            ,knapSack(wt,value,weight,sizeOfArray-1));

        else if(wt[sizeOfArray-1]>weight)
            return t[sizeOfArray][weight] =  knapSack(wt,value,weight,sizeOfArray-1);

        return -1;
    }
}
