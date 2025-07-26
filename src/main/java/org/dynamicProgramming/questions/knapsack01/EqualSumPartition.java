package org.dynamicProgramming.questions.knapsack01;

// is it possible to get equal sum partition from the array.

public class EqualSumPartition {

    static boolean[][] t;
    public static void main(String[] args) {
        int [] arr = {1,5,11,5};
        int sum=0;
        int n = arr.length;

        for(int i:arr){
            sum = sum+i;
        }
        System.out.println("Output is "+ equalSumPartition(arr,sum,n));
    }

    static boolean equalSumPartition(int [] arr,int sum,int n){
        if(sum%2 !=0 ) // if the sum is odd then it can't be divided into subset with equal sum.
            return false;

        // else if is even.
             sum = sum/2;
            t = new boolean[n+1][sum+1];
            return subSetProblem(arr,sum,n); // same subset code.

    }

    static boolean subSetProblem(int [] arr, int sum,int n){

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    t[i][j] = false;
                if(j==0)
                    t[i][j]=true;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++) {
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else
                    t[i][j] = t[i-1][j];
                }
            }


        return  t[n][sum];
    }
}
