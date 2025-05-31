package org.InterviewQuestion;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int [] coins = {186,419,83,408};
        System.out.println("output: "+coinChange(coins,6249));
    }

    public static int coinChange(int[] coins, int amount) {
        int totalCoins=0;
        Arrays.sort(coins);
        for(int i=coins.length-1;i>=0;i--){
            if(coins[i]<=amount){
                totalCoins = amount/coins[i]+totalCoins;
                amount = amount%coins[i];
                System.out.println("total coin "+totalCoins +" amount "+amount);
            }
        }
        if(amount==0)
            return totalCoins;
        return -1;
    }
}
