package org.dynamicProgramming.questions.LCS;

public class PrintingLongestCommonSubseq {
    static int[][] t;
    public static void main(String[] args) {
        String s1 = "abgdf";
        String s2 = "abcdaf";
        t = new int[s1.length()+1][s2.length()+1];
        // reverse the string.
        System.out.println("String is : "+lcsTopDownApproach(s1,s2,s1.length(),s2.length()));
    }

    static String lcsTopDownApproach(String s1, String s2, int n,int m){
        // base condition
        StringBuilder str = new StringBuilder();
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

        int i=n,j=m;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                    str.append(s1.charAt(i-1));
                    //System.out.println("Str "+str);
                    i--;
                    j--;
                }else{
                   // System.out.println("else");
                    int val1 = t[i][j-1];
                    int val2 = t[i-1][j];
                    if(val1>=val2)
                        j--;
                    else
                        i--;
                }
        }
        System.out.println("longest length of subsequence: "+t[n][m]);

        return str.toString();

    }
}
