package org.Recursion.question;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String input ="a1B2";
        input = input.toLowerCase();
        String output ="";
        generateLetterCasePermutation(0,input,output);

    }
    private static void generateLetterCasePermutation(int index ,String input, String output){
        if(input.length()==index){
            System.out.print(output+" ");
            return;
        }

        if(input.charAt(index)>=48 && input.charAt(index)<=57){
            String output1 = output;
            output1 = output+ input.charAt(index);
            //output2 = output+ input.charAt(index);
            generateLetterCasePermutation(index + 1, input, output1);
        }else {
            String output1=output;
            String output2=output;
            output1 = output + input.charAt(index);
            int c = input.charAt(index) - 32;
            output2 = output + (char) c;
            generateLetterCasePermutation(index + 1, input, output1);
            generateLetterCasePermutation(index + 1, input, output2);
        }


    }
}
