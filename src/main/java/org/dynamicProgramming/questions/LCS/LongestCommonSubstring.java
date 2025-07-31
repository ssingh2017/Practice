package org.dynamicProgramming.questions.LCS;

public class LongestCommonSubstring {

    static int[][] t;
    public static void main(String[] args) {
        String s1 = "GeeksforGeeks";
        String s2 = "GeeksQuiz";

        int n = s1.length();
        int m = s2.length();
        t = new int[n+1][m+1];

        System.out.println("output "+lcsTopDownApproach(s1,s2,n,m));

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
                if(s1.charAt(i-1)==s2.charAt(j-1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                }
                else {
                    t[i][j] = 0;
                }
            }
        }
        int length =0;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(t[i][j]>=length)
                    length=t[i][j];
            }
        }
        return length;
    }
}
