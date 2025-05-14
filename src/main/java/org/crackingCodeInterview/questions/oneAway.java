package org.crackingCodeInterview.questions;

import static java.lang.Math.abs;

public class oneAway {
    public static void main(String[] args) {
        String s1 = "pale";
        String s2 = "bale";
        boolean result =true;
        int diff = abs(s1.length()-s2.length());
        if( diff > 1){
                result = false;
        }else{
            if(diff == 0){
                int diffCounter =0;
                for(int i=0;i<s1.length();i++){
                    if(s1.charAt(i) != s2.charAt(i)) {
                        diffCounter++;
                    }
                    if(diffCounter>1){
                        result = false;
                        break;
                    }
                }
            }else {
                boolean isS1 = s1.length() >= s2.length();
                int diffCounter = 0;
                if(isS1){
                    for (int i = 0, j = 0; i < s1.length() && j < s2.length();) {
                        if (s1.charAt(i) != s2.charAt(j)) {
                            i++;
                            diffCounter++;
                        } else if (s1.charAt(i) == s2.charAt(j)){
                            i++;
                            j++;
                        }else if (diffCounter>1) {
                            result=false;
                            break;
                        }
                    }
                }else {
                    for (int i = 0, j = 0; i < s2.length() && j < s1.length();) {
                        if (s1.charAt(j) != s2.charAt(i)) {
                            i++;
                            diffCounter++;
                        } else if (s1.charAt(j) == s2.charAt(i)){
                            i++;
                            j++;
                        } else if (diffCounter>1) {
                            result=false;
                            break;
                        }
                    }
                }

            }
        }
        System.out.println( " output is "+result );
    }
}
