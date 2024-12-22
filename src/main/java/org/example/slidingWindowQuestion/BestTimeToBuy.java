package org.example.slidingWindowQuestion;

public class BestTimeToBuy {

    public static void main(String [] args){

        int prices [] = new int[]{10,3,9,1,2};
        System.out.println("Profit is "+maxProfit(prices));
    }

    public static int maxProfit(int [] prices){
        int profit = 0;
        // handle for array size 0 and 1
        if(prices.length==0 || prices.length==1)
            return profit;
        int buyValue = prices[0];
        int sellValue;

        for(int i=1;i<prices.length;i++){
            sellValue = prices[i];
            int diff = sellValue-buyValue;
            if(profit<diff){
                profit = diff;
            }
            if(diff<0){
                buyValue = sellValue;
            }
        }
        return profit;
    }
}
