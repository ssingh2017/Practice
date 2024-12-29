package org.example.binarySearch;

public class KokoEatingBanana {
    public static void main(String[] args){
        int [] piles = {23,10,25,4};
        System.out.println("output "+minEatingSpeed(piles,7));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        int res=0;
        for(int element:piles){
            if(element>max)
                max=element;
        }
        //System.out.println("max "+max);
        int left = 1;
        int right = max;
        int middle=0;
        while(left<=right){
             middle = (right + left) /2;
            int sum =0;

            for(int element : piles){
                sum  = sum +(int)Math.ceil((double) element /middle);
                //sum = (sum + x);
            }
           //System.out.println("Sum "+sum +" middle "+middle);
            if(sum>h){
                left =middle+1;
                }
            if(sum<=h) {   // why equal to condition at this loop
                right = middle - 1;
                res=middle;
            }

//            if(sum == h)
//                return middle;
        }
        return res;
    }
}
