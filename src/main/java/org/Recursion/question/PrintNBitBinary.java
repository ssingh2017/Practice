package org.Recursion.question;

import java.util.ArrayList;
import java.util.List;

// print n bit binary number in which no. of 1's are greater than 0's in the all prefix of that number.
public class PrintNBitBinary {
    public static void main(String[] args) {
        int n = 4;
        List<String> outputList = new ArrayList<>();
        generateNumbers(5,0,0,"",outputList);
        System.out.println("output "+outputList);
    }

    private static void generateNumbers(int n, int onesCount, int zeroesCount , String output, List<String> outputList){
        if(n==0){
            outputList.add(output);
            return;
        }
            String output1 = output+"1";
            generateNumbers(n-1,onesCount+1,zeroesCount,output1,outputList);
        if(onesCount>zeroesCount){
           // String output1 = output+"1";
            String output2 = output+"0";
            n--;
           // generateNumbers(n,onesCount+1,zeroesCount,output1,outputList);
            generateNumbers(n,onesCount,zeroesCount+1,output2,outputList);
        }
    }

}
