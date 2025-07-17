package org.example.slidingWindowQuestion;

public class LongestRepCharacterReplacement {
    public static void main(String[] args) {
        String inputString = "AAABABB";
        int k =1;
        System.out.println("output: "+characterReplacement(inputString,k));
    }

    private static int characterReplacement(String s , int k){
        // base case
        if(s.length()==1)
            return 1;
        int windowLength = 1,maxWindowLength=0;
        int countOfMaximumRepeatedChar = 0;
        int[] countArr = new int[26];
        int leftPointer=0,rightPointer =0;
        int characterIntegerValue = s.charAt(rightPointer)-'A';
        countArr[characterIntegerValue]++;
        while(rightPointer<s.length()){

            windowLength = rightPointer - leftPointer +1;
            countOfMaximumRepeatedChar = maximumRepeatedCharCount(s,leftPointer,rightPointer);

          //  System.out.println("L "+leftPointer+" R "+rightPointer +" WL "+windowLength+" MRC "+countOfMaximumRepeatedChar);

            if(windowLength-countOfMaximumRepeatedChar<=k){
                rightPointer++;
            }else{
                leftPointer++;
                windowLength--;
            }
            if(windowLength>maxWindowLength)
                maxWindowLength=windowLength;
        }

        return maxWindowLength;
    }

    private static int maximumRepeatedCharCount(String inputString,int leftpointer, int rightPointer){
        int [] countArray = new int[26];
        for(int i=leftpointer;i<=rightPointer;i++){
            int characterIntegerValue = inputString.charAt(i) - 'A';
            countArray[characterIntegerValue]++;
        }

        int maxCount = 0;
        for(int i=0;i<26;i++){
            int count = countArray[i];
            if(count>maxCount)
                maxCount = count;
        }
        return maxCount;
    }
}
