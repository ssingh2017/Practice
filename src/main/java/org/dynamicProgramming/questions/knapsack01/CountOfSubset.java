package org.dynamicProgramming.questions.knapsack01;

public class CountOfSubset {
    static int[][] t;
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,0};
        int sum = 10;
        t = new int[arr.length+1][sum+1];
        System.out.println("Count of subset "+countSubset(arr,sum,arr.length));
    }

    static int countSubset(int[] arr,int sum,int n){

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

                if(arr[i-1]<=j)
                    t[i][j] = t[i-1][j-arr[i-1]]+t[i-1][j];
                else
                    t[i][j] = t[i-1][j];
            }
        }

        return t[n][sum];
    }
}
