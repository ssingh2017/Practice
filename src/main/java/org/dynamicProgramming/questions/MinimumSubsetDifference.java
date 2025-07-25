package org.dynamicProgramming.questions;

import java.util.Arrays;

public class MinimumSubsetDifference {

    static boolean [][] t;
    public static void main(String[] args) {
        int[] arr = {1,2,7};
        int range=0;
        for(int i:arr){
            range = range+i;
        }
        t = new boolean[arr.length+1][range+1];
        System.out.println("minimum diff "+minimumDiff(arr,range,arr.length));
    }

    static int minimumDiff(int []arr,int sum,int n){
        int[] s1 = subset(arr,sum,n);
        int min = sum;
        for(int i:s1){
            if(i!=-1){
                int diff = sum - 2*i;
                if(diff<min)
                    min=diff;
            }
        }
        return min;
    }

    static int[] subset(int [] value,int sum,int n){
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i==0)
                    t[i][j]=false;
                if(j==0)
                    t[i][j]= true;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++) {
                if(value[i-1]<=j)
                    t[i][j]= (t[i-1][j-value[i-1]] || t[i-1][j]);
                else
                    t[i][j]= t[i-1][j];

            }
        }
        int i=n;
        int k=0;
        int[] s1 = new int[sum/2+1];
        for(int x:s1)
            Arrays.fill(s1,-1);
        for(int j=0;j<=sum/2;j++){

            if(t[i][j]==true){
                s1[k]=j;
                k++;
            }
        }

        return s1;
    }
}
