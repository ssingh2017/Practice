package org.dynamicProgramming.questions.LCS;

//Solved using recursion.

import java.util.Arrays;

public class LongestCommonSubsequenceRecursion {

    static int[][] t;
    static int[][]t2;
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        t = new int[s1.length()+1][s2.length()+1];

        System.out.println("The longest common subsequence is "+lcsRecursion(s1,s2,s1.length(),s2.length()));

        for(int i=0;i<s1.length()+1;i++)
            Arrays.fill(t[i],-1);
        System.out.println("The longest common subsequence is using memoized  "+ lcsRecursionWithMemoized(s1,s2,s1.length(),s2.length()));

        // top-down approach
        t2= new int[s1.length()+1][s2.length()+1];
        System.out.println("longest common subsequence using top-down approach: "+lcsTopDownApproach(s1,s2,s1.length(),s2.length()));

    }

    static int lcsRecursion(String s1,String s2, int n, int m){
        if(n==0 || m==0 )
            return 0;

        if(s1.charAt(n-1) == s2.charAt(m-1))
            return 1+lcsRecursion(s1,s2,n-1,m-1);
        else
            return Math.max(lcsRecursion(s1,s2,n-1,m),lcsRecursion(s1,s2,n,m-1));
    }


    static int lcsRecursionWithMemoized(String s1, String s2, int n, int m){
        if(n==0 || m==0 )
             return 0;

        if(t[n][m]!=-1)
            return t[n][m];

        if(s1.charAt(n-1) == s2.charAt(m-1))
            return t[n][m] = 1+lcsRecursion(s1,s2,n-1,m-1);
        else
            return t[n][m] = Math.max(lcsRecursion(s1,s2,n-1,m),lcsRecursion(s1,s2,n,m-1));
    }


    static int lcsTopDownApproach(String s1, String s2, int n,int m){
        // base condition

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0||j==0)
                    t2[i][j]=0;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){

                if(s1.charAt(i-1)==s2.charAt(j-1))
                    t2[i][j] = 1+t2[i-1][j-1];
                else
                    t2[i][j] = Math.max(t2[i][j-1],t2[i-1][j]);
            }
        }
        return t2[s1.length()][s2.length()];
    }
}
