package org.dynamicProgramming.questions.MCM;

public class MatrixChainMultiplicationRecursion {
   // static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,3};

        // 1. Find i and j
        int i=1,j=arr.length-1;

        System.out.println("Minimum value: "+solve(arr,i,j));
    }

    static int solve(int[] arr, int i,int j){

        // 2. Base condition
        if(i>=j)
            return 0;

        int min = Integer.MAX_VALUE;

        // 3. Find k and write for loop
        for(int k=i;k<=j-1;k++){
            int tempAns = solve(arr,i,k) + solve(arr,k+1,j) + (arr[i-1]*arr[k]*arr[j]);

        // 4. calculate ans from tempAns.
            if(min>tempAns)
                min = tempAns;
        }
        return min;
    }
}
