package org.Recursion.question;

public class SpacePermutation {
    public static void main(String[] args) {
        String input = "abcd";
        String output ="";
        output = output + input.charAt(0);
        generateSpacePermutation(1,input,output);
    }

    private static void generateSpacePermutation(int index , String input,String output){
        if(input.length()==index){
            System.out.print(output+"  ");
            return;
        }
        String output1 = output + input.charAt(index);
        String output2 = output + '_'+input.charAt(index);

        generateSpacePermutation(index+1,input,output1);
        generateSpacePermutation(index+1,input,output2);

    }
}
