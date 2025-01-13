package org.example.TwoPointerQuestion;

public class TrappingRainWater {
    public static void main(String[] args){
        int[] height ={0,2,0,3,1,0,1,3,2,1};
        System.out.println("total area "+trap(height));
    }

    public static int trap(int[] height) {
        int [] rightMaxArray = new int[height.length];
        int r_max = height[height.length-1];
        rightMaxArray[height.length-1] = r_max;
        for(int i=height.length-2;i>=0;i--){
            rightMaxArray[i] = r_max;
            if(height[i]>r_max)
                r_max = height[i];
        }
        int l_max = height[0];
        int sum =0;
        for(int i=0;i<height.length;i++){
            int x = Math.min(l_max,rightMaxArray[i])-height[i];
            if(x>0)
                sum = sum+x;
            if(height[i]>l_max)
                l_max = height[i];
        }

        return sum;
    }
}
