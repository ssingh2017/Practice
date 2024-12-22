package org.example.array.hashing;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {
    public static void main(String [] args){
        //String [] strs = new String[]{"act","pots","tops","cat","stop","hat"};
        String [] strs = new String[]{"","",""};
        System.out.println("output "+groupAnagrams(strs));



    }
    public static List<List<String>> groupAnagrams(String [] strs){
        List<List<String>> res = new ArrayList<>();
        List<String> traversedString = new ArrayList<>();
        for(int i=0;i< strs.length;i++){
            List<String> stringList;
            if(!traversedString.contains(strs[i])){
                stringList = new ArrayList<>();
                stringList.add(strs[i]);
            }else{
                continue;
            }
            for(int j=i+1;j<strs.length;j++){
                if(strs[i].equals(strs[j])){
                    stringList.add(strs[j]);
                    traversedString.add(strs[i]);
                }
                if(strs[i].length() == strs[j].length() && !traversedString.contains(strs[j])){
                    if(isAnagram(strs[i],strs[j])){
                        stringList.add(strs[j]);
                        traversedString.add(strs[j]);
                    }
                }
            }
            if(stringList != null)
                res.add(stringList);
            traversedString.add(strs[i]);
        }
        return res;
    }

    public static boolean isAnagram(String a, String b){
        int [] charCount = new int[26];
        for(int i=0;i<a.length();i++){
            int charAscii = a.charAt(i)-97;
            charCount[charAscii]++;
        }
        for(int j=0;j<b.length();j++){
            int charAscii = b.charAt(j) -97;
            if(charCount[charAscii] <= 0)
                return false;
            else
                charCount[charAscii]--;
        }
        return true;
    }
}
