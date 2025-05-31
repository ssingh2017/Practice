package org.InterviewQuestion;


public class FindFirstOccurrenceOfString {
    public static void main(String[] args) {
        String hayStack = "mississippi";
        String needle = "issipi";
        System.out.println(" output: "+firstOccurrence(hayStack,needle));

    }

    public static int firstOccurrence(String haystack,String needle){
        int i=0;
        int start=0;
        if(needle.length()>haystack.length())
            return -1;
        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(0)){
                start=i;
               // i++;
                int j=0;
                while(j<needle.length() && start<haystack.length()){
                    if(haystack.charAt(start)==needle.charAt(j)){
                        start++;
                        j++;
                    }else{
                        break;
                    }
                }
                if(j==needle.length())
                    return i;
            }

            i++;
        }
        return -1;
    }
}
