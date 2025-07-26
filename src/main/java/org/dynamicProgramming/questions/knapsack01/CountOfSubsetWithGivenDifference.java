package org.dynamicProgramming.questions.knapsack01;

// Count the number of subset for the given difference.
// {1,2} {1,3}
//{1,1,2} {3}
//{1,3} {1,2}

public class CountOfSubsetWithGivenDifference {
    static int[][] t;
    public static void main(String[] args) {

        int[] arr ={1,1,2,3};
        int diff =1;
        int sum =0;
        for(int i:arr)
            sum = sum+i;

        int s1Sum = (sum+diff)/2;
        t=new int[arr.length+1][s1Sum+1];
        System.out.println("Count of subset "+subsetCount(arr,s1Sum,arr.length));

    }

    static int subsetCount(int[] arr,int sum,int n){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    t[i][j] = 0;
                if(j==0)
                    t[i][j] = 1;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){

                if(arr[i-1]<=j)
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                else
                    t[i][j] = t[i-1][j];
            }
        }

        return t[n][sum];
    }
}
