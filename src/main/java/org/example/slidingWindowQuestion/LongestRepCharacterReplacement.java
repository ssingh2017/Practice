package org.example.slidingWindowQuestion;

public class LongestRepCharacterReplacement {
    public static void main(String[] args) {
        String inputString = "AABABBA";
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
        while(rightPointer<s.length()){
            countArr[characterIntegerValue]++;
            windowLength = rightPointer - leftPointer+1;
            countOfMaximumRepeatedChar = maximumRepeatedCharCount(countArr,leftPointer,rightPointer);
            System.out.println("leftPointer "+leftPointer+" right "+rightPointer+" Wl "+windowLength+" MRC "+countOfMaximumRepeatedChar);
            if(windowLength-countOfMaximumRepeatedChar<=k){
                rightPointer++;
                if(rightPointer<s.length())
                    characterIntegerValue = s.charAt(rightPointer)-'A';

            }else{
//                characterIntegerValue =s.charAt(leftPointer)-'A';
//                countArr[characterIntegerValue]--;
                leftPointer++;
                characterIntegerValue = s.charAt(leftPointer)-'A';
                windowLength--;
            }
            //System.out.println("windowLenght "+windowLength);
            if(windowLength>maxWindowLength)
                maxWindowLength=windowLength;
        }

        return maxWindowLength;
    }

    private static int maximumRepeatedCharCount(int [] arr,int leftpointer, int rightPointer){
        int maxCount = 0;
        for(int i=leftpointer;i<=rightPointer;i++){
            int count = arr[i];
            if(count>maxCount)
                maxCount = count;
        }
        return maxCount;
    }
}
