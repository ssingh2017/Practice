package org.crackingCodeInterview.questions;

public class StringCompression {
    public static void main(String[] args) {
        String s = "x";
        //char [] chars = {'a','a','a','b','b','c','c','c','d','d'};
        //char [] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        char [] chars = {'a','b','b','b','b','b','b','b'};
        //System.out.println( "compressed string is - "+compressedString(s));
        compressChar(chars);
    }

    public static String compressedString(String s){
        StringBuilder str = new StringBuilder();
        int counter =1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1) == s.charAt(i))
                counter++;
            else{
                str.append(s.charAt(i-1)).append(counter);
                counter=1;
            }
            if(i==s.length()-1){
                str.append(s.charAt(i)).append(counter);
            }
        }
        return str.toString();

    }

    // TODO : issue not handled is when the first character is not duplicate. ex -- abbb

    public static int compressChar(char [] chars){
        int counter =1;
        int k=0;
        for(int i=1;i<chars.length;i++){
            if(chars[i-1]==chars[i]){
                counter++;
            }else{
                if(counter<9){
                    chars[k] = chars[i-1];
                    chars[k+1] = Integer.toString(counter).charAt(0);
                }else{
                    chars[k] = chars[i-1];
                    chars[k+1] = Integer.toString(counter).charAt(0);
                    chars[k+2] =Integer.toString(counter).charAt(1);
                    k++;
                }
                k=k+2;
                counter =1;
            }
            if(i==chars.length-1){
                chars[k] = chars[i-1];
                chars[k+1] = Integer.toString(counter).charAt(0);
                k = k+2;
            }
        }
        System.out.println("k is "+k);
        for(int i=0;i<k;i++)
            System.out.print(chars[i]+" ");
        return k;
    }
}
