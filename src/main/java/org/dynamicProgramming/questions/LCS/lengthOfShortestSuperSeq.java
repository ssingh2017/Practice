package org.dynamicProgramming.questions.LCS;


public class lengthOfShortestSuperSeq {
    static int[][] t;
    public static void main(String[] args) {
        String str1 = "geek";
        String str2 ="eke";

        t = new int[str1.length()+1][str2.length()+1];
        System.out.println("output : " +lcsTopDownApproach(str1,str2,str1.length(),str2.length()));
    }

    static int lcsTopDownApproach(String s1, String s2, int n,int m){
        // base condition

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0)
                    t[i][j]=0;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){

                if(s1.charAt(i-1)==s2.charAt(j-1))
                    t[i][j] = 1+t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i][j-1],t[i-1][j]);
            }
        }

        // extra part apart from LCS.
        int lengthOfLCS = t[n][m];
        int totalLengthOfBothString = n+m;

        return totalLengthOfBothString-lengthOfLCS;

    }
}
