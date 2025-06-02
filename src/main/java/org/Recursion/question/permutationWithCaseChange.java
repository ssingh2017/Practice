package org.Recursion.question;

public class permutationWithCaseChange {
    public static void main(String[] args) {
        String input = "ab";
        String output = "";
        generateCaseChangePermutation(0,input,output);
    }

    private static void generateCaseChangePermutation(int index ,String input, String output){
        if(input.length() == index){
            System.out.print(output+" ");
            return;
        }

        String output1 = output+input.charAt(index)+"";
        int z = input.charAt(index)-32;
        String output2 = output+(char)z;

        generateCaseChangePermutation(index+1,input,output1);
        generateCaseChangePermutation(index+1,input,output2);

    }
}
