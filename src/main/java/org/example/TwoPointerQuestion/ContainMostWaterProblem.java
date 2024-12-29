package org.example.TwoPointerQuestion;

public class ContainMostWaterProblem {
    public static void main(String [] args){

        int [] heights = {2,2,2};
        System.out.println("maxArea is "+maxArea(heights));

    }

    public static int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int maxArea =0;
        while(j>i){
            int breadth = j - i;
            int length = Math.min(heights[i] ,heights[j]);
            int area = length * breadth;
            if(area>maxArea){
                maxArea =area;
            }
            if(heights[i]>heights[j])
                j--;
            else
                i++;
        }

        return maxArea;
    }
}
