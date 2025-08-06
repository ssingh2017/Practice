package org.dynamicProgramming.questions.LCS;

public class PrintSCS {
    static int[][] t;

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int l1 =s1.length();
        int l2 = s2.length();

        t = new int[l1+1][l2+1];
        lcsTopDownApproach(s1,s2,l1,l2);
        String s = printSCS(s1,s2,l1,l2);  // reverse the output.
        StringBuilder str = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        System.out.println("Str is : "+str);
    }



    static String printSCS(String s1,String s2,int l1,int l2){
        int i=l1,j=l2;
        StringBuilder str = new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                str.append(s1.charAt(i-1));
                i--;
                j--;
            }else{
                if(t[i][j-1]>t[i-1][j]){
                    str.append(s2.charAt(j-1));
                    j--;
                }else{
                    str.append(s1.charAt(i-1));
                    i--;
                }
            }
        }

        while(i>0){
            str.append(s1.charAt(i-1));
            i--;
        }
        while (j>0){
            str.append(s2.charAt(j-1));
            j--;
        }

        return str.toString();
    }


    static void lcsTopDownApproach(String s1, String s2, int n,int m){
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
        //return t[s1.length()][s2.length()];
    }
}
