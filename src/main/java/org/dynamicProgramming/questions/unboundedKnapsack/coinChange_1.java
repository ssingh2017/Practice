package org.dynamicProgramming.questions.unboundedKnapsack;

// number of ways to get the sum, assume there are unlimted coins.

public class coinChange_1 {

    static int[][] t;
    public static void main(String[] args) {
        int[] coin ={1,2,3};
        int sum = 7;
        t = new int[coin.length+1][sum+1];
        System.out.println("no of ways "+numberOfWays(coin,sum,coin.length));
    }

    static int numberOfWays(int[] coin,int sum,int n){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    t[i][j]=0;
                if(j==0)
                    t[i][j]=1;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coin[i-1]<=j){
                    t[i][j] = t[i][j-coin[i-1]] + t[i-1][j];
                }else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][sum];
    }
}
