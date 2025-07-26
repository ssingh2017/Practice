package org.dynamicProgramming.questions.unboundedKnapsack;

public class CoinChange_2 {
    static int[][] t;
    public static void main(String[] args) {
        int[] coins ={25,10,5};
        int v =30;
        t = new int[coins.length+1][v+1];
        System.out.println("Minimum coins required "+coinChange(coins,v,coins.length));
    }

    static int coinChange(int[] coins, int v, int n){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<v+1;j++){
                if(i==0)
                    t[i][j]=Integer.MAX_VALUE-1;
                if(j==0)
                    t[i][j]=0;
            }
        }
        for(int i=1,j=1;j<v+1;j++){
            if(j%coins[0]==0)
                t[i][j]=j/coins[0];
            else
                t[i][j]=Integer.MAX_VALUE-1;
        }

        for(int i=2;i<n+1;i++){
            for(int j=1;j<v+1;j++){
                if(coins[i-1]<=j)
                    t[i][j]=Math.min(t[i][j-coins[i-1]]+1,t[i-1][j]);
                else
                    t[i][j] = t[i-1][j];
            }
        }

        return t[n][v];
    }
}
