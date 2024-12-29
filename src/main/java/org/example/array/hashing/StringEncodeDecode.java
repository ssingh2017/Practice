package org.example.array.hashing;

import java.util.ArrayList;
import java.util.List;


public class StringEncodeDecode {
    public static void main(String [] args){
        StringEncodeDecode stringEncodeDecode =  new StringEncodeDecode();
        List<String> strs = new ArrayList<>();
        strs.add("we");
        strs.add("say");
        strs.add("#");
        strs.add("yes");
        System.out.println(strs);
        String encodedString = stringEncodeDecode.encode(strs);
        System.out.println("list of string is "+stringEncodeDecode.decode(encodedString));
    }

    public String encode(List<String> strs){
        StringBuilder str = new StringBuilder();
        String delimiter = "#";
        for(int i=0;i<strs.size();i++){
            int length = strs.get(i).length();
            str.append(length).append(delimiter).append(strs.get(i));
        }
        System.out.println("String is "+str);

        return str.toString();
    }
    public List<String> decode(String str){
        List<String> res = new ArrayList<>();
        for(int i=0;i<str.length();i++){
           // System.out.println(str.charAt(i));
            StringBuilder x = new StringBuilder();
            System.out.println("i is "+i);
            while(str.charAt(i) !='#'){
                x.append(str.charAt(i));
                i++;
            }
            System.out.println("x value "+x);
            int length = Integer.parseInt(x.toString());
            StringBuilder value = new StringBuilder();
            for(int k=i+1;k<=i+length;k++){
                value.append(str.charAt(k));
            }
            System.out.println("value is "+value);
            res.add(value.toString());
            i=i+length;
        }
        return res;
    }
}
