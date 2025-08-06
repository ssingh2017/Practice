package org.dynamicProgramming.questions.LCS;

public class LongestPalindromeSubseqLength {
    static int[][] t;
    public static void main(String[] args) {
        String str1 = "agbcba";

        // Reverse the str1 to get str2, and then we can use LCS
        StringBuilder str2 = new StringBuilder();
        for(int i=str1.length()-1;i>=0;i--){
            str2.append(str1.charAt(i));
        }
        //System.out.println("String2 : "+str2);
        int length = str1.length();
        t = new int[length+1][length+1];

        System.out.println("longestPanlindromeLength -  "+longestPanlindromeLength(str1,str2.toString(),length));

    }
    static int longestPanlindromeLength(String str1, String str2, int length){
        // initialization
        for(int i=0;i<length+1;i++){
            for(int j=0;j<length+1;j++){
                if(i==0 || j==0)
                    t[i][j] =0;
            }
        }

        for(int i=1;i<length+1;i++){
            for(int j=1;j<length+1;j++){

                //if characters are equal
                if(str1.charAt(i-1)==str2.charAt(j-1))
                    t[i][j] = 1+t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
            }
        }

        return t[length][length];
    }
}
