package org.example.slidingWindowQuestion;

public class MaximumSumOfSubarray {
    public static void main(String[] args) {
        int arr [] ={1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k =4;
        System.out.println("output "+maxSum(arr,k));
    }

    private static int maxSum(int [] arr,int k){
        if(k>arr.length)
            return -1;

        int window [] = new int[k];
        int start = 0;
        int end =k-1;
        int sum = 0;
        for(int i=start;i<=end;i++) {
            sum +=arr[i];
        }
        int maxSum = sum;
        start++;
        end++;

        while(end<arr.length){
           // System.out.println("start "+arr[start]+" end "+arr[end]);
            sum = sum + (arr[end]-arr[start-1]);
            if(sum>maxSum)
                maxSum=sum;
            start++;
            end++;
        }

        return maxSum;
    }
}
