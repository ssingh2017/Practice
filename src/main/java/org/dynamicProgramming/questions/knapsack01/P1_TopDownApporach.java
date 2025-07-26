package org.dynamicProgramming.questions.knapsack01;

public class P1_TopDownApporach {

    static int [][] t;

    public static void main(String[] args) {
        int [] weight = {4,2,5,3};
        int [] value = {3,5,4,6};
        int maxWeightOfKnapsack = 10;

        System.out.println("max profit "+knapSack(value,weight,maxWeightOfKnapsack));

    }

    public static int knapSack(int listOfValues[], int listOfweights[],int maxWeightOfKnapsack){

        int sizeOfArray = listOfValues.length; // size of both value and weight array will be same.

        t = new int[sizeOfArray+1][maxWeightOfKnapsack+1];
        //Base condition.

        for(int i=0;i<sizeOfArray+1;i++){
            for(int j=0;j<maxWeightOfKnapsack+1;j++){
                if(i==0 || j==0)
                    t[i][j]=0;
            }
        }

        for(int i=1;i<sizeOfArray+1;i++){
            for(int j=1;j<maxWeightOfKnapsack+1;j++){
                if(listOfweights[i-1]<=j)
                    t[i][j] = Math.max(listOfValues[i-1] +t[i-1][j-listOfweights[i-1]],t[i-1][j]);
                else
                    t[i][j]= t[i-1][j];
            }
        }

        return t[sizeOfArray][maxWeightOfKnapsack];
    }
}
