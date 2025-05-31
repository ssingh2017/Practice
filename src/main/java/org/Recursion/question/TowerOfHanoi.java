package org.Recursion.question;

public class TowerOfHanoi {
    static int numberOfSteps =0;
    public static void main(String[] args) {
        System.out.println("total count is : "+solveHanoi(3,'s','d','h'));

    }

    private static int solveHanoi(int n,char s,char d,char h){
        if(n==1) {
            System.out.println("Moving last plate "+n+" from source: "+s+" to destination: "+d);
            return 1;
        }
       int count1= solveHanoi(n-1,s, h,d);
        System.out.println("Moving plate "+n+" from source: "+s+" to destination: "+d);
        int count2 = solveHanoi(n-1,h,d,s);

        return count1+count2+1;

    }
}
