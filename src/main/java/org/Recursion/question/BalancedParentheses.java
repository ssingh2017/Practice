package org.Recursion.question;

import java.util.ArrayList;
import java.util.List;

public class BalancedParentheses {
    public static void main(String[] args) {
        int n =3;
        int openBrackets = n;
        int closeBrackets = n;
        List<String> outputList = new ArrayList<>();
        String output ="";
        generateBalanceParenthese(openBrackets,closeBrackets,output,outputList);
        System.out.println("output: "+outputList);

    }

    private static void generateBalanceParenthese(int openBrackets,int closeBrackets,String output,List<String> outputList){

        if(openBrackets==0 && closeBrackets ==0){
            outputList.add(output);
            return;
        }

        if(openBrackets>0){
            String output1 = output + "(";
            //openBrackets--;
            generateBalanceParenthese(openBrackets-1,closeBrackets,output1,outputList);
        }

        if(closeBrackets>openBrackets && closeBrackets>0){

                String output2 = output + ")";
                generateBalanceParenthese(openBrackets,closeBrackets-1,output2,outputList);


        }
    }
}
