package org.example.TwoPointerQuestion;

public class TwoIntegerSum {
    public static void main(String [] args){
        int numbers[] = {1,2,3,4};
        int k = 3;
        int res [] = twoSum(numbers,k);
        for(int i : res)
            System.out.print(i+" ");
    }

    public static int[] twoSum(int[] numbers, int target) {
        int output [] = new int[2];
        int i=0;
        int j=numbers.length-1;
        while(j>=i){
            if(numbers[i]+numbers[j]==target){
                output[0] = i;
                output[1] = j;
                return output;
            }if(numbers[i]+numbers[j]>target){
                j--;
            } else if (numbers[i]+numbers[j]<target) {
                i++;
            }
        }
        return output;
    }

}
