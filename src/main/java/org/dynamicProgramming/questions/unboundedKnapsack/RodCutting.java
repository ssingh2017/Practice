package org.dynamicProgramming.questions.unboundedKnapsack;

public class RodCutting {
   static int[][] t;
    public static void main(String[] args) {
        int[] price = {1,4,11,9,10,17,17,20};
        int[] length = {1,2,3,4,5,6,7,8};
        int rodLength = 8;

        t = new int[price.length+1][rodLength+1];
        System.out.println("max profit "+maxProfit(price,length,rodLength,price.length));
    }

    static int maxProfit(int[] price,int[] length, int rodLength,int n){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<rodLength+1;j++){
                if(i==0)
                    t[i][j]=0;
                if(j==0)
                    t[i][j]=0;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<rodLength+1;j++){
                if(length[i-1]<=j){
                    t[i][j] = Math.max( price[i-1]+ t[i][j-length[i-1]] , t[i-1][j]);
                }else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[n][rodLength];
    }
}
