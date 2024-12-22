package org.example.array.hashing;

public class CheckIsAnagram {
    public static void main(String [] args){
        String s = "jam";
        String t = "jar";

        System.out.println("Is Strings anagram "+ isAnagram(s,t) );
    }

    private static boolean isAnagram(String s, String t) {
        int charCount [] = new int[26];
        if(s.length() != t.length())
            return false;
        for(int i=0;i<s.length();i++){
            int ascii = s.charAt(i)-97;
            charCount[ascii]++;
        }
        for(int j=0;j<t.length();j++){
            int ascii = t.charAt(j)-97;
            if(charCount[ascii]<=0){
                return false;
            }else{
                charCount[ascii]--;
            }
        }
        return true;
    }
}
