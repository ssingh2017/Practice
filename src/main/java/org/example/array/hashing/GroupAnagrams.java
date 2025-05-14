package org.example.array.hashing;

import java.util.*;

public class GroupAnagrams {
    public static void main(String [] args){
        String [] strs = new String[]{"act","pots","tops","cat","stop","hat"};
        //String [] strs = new String[]{"","",""};
        System.out.println("output "+groupAnagrams(strs));
        System.out.println("outpu 2 "+groupAnagrams2(strs));


    }

    // my solution.
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


    // NeetCode solution
    //Time complexity - O(mn)  --- m - no. of Strings and n- avg length of string.
    public static List<List<String>> groupAnagrams2(String [] strs){
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int [] intCount = new int [26];
            for(char c : str.toCharArray()){
                intCount[c - 'a']++;
            }

            String key = Arrays.toString(intCount);   //

            List<String> stringList = new ArrayList<>();
           if(map.containsKey(key)){
               stringList = map.get(key);
               stringList.add(str);
               map.put(key,stringList);
           }else{
               stringList.add(str);
               map.put(key,stringList);
           }
        }
        return new ArrayList<>(map.values());
    }
}
