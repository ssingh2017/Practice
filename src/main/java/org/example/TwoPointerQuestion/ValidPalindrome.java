package org.example.TwoPointerQuestion;


// Stuck when we have only no alphabet character
public class ValidPalindrome {
    public static void main(String [] args){
        System.out.println("output "+ isPalindromeUsingExtraSpace(",.")); /// Logic using extra space. - O(n)  and O(n)
        System.out.println("output "+ isPalindrome("Was it a car or a: cat I saw?"));  //  O(n)  and O(1)
    }

    public static boolean isPalindromeUsingExtraSpace(String s) {
        int i =0;

//        if(s.isEmpty()|| s.length()==1)
//            return true;
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){
            char x = Character.toLowerCase(s.charAt(i));
            if(checkIfValidCharacter(x))
                sb.append(x);
            i++;
        }
      //  System.out.println("Modified string "+sb.length());
        int k=0;
        int j = sb.length()-1;
        while(k<j){
            if(sb.charAt(k) == sb.charAt(j)){
                k++;
                j--;
              //  System.out.println("k "+k+" j "+j);
            }else
                return false;
        }
        return true;
    }

    //

    public static boolean isPalindrome(String s){

        int i=0;
        int j = s.length()-1;
        while(i<j){

            while( i<s.length()  &&  !checkIfValidCharacter(s.charAt(i)) ){
                i++;
              //  x = Character.toLowerCase(s.charAt(i));
            }

            while(j>0 &&  !checkIfValidCharacter(s.charAt(j))){
                j--;
               // y = Character.toLowerCase(s.charAt(j));
            }
            if( i<s.length() && j>0 && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            i++;
            j--;

        }
        return true;
    }
    public static boolean checkIfValidCharacter(Character c){

        int x = c;
//        if((x>=48 && x<=57) || (x>=65 && x<=90) || (x>=97 && x<=122))
//            return true;
        if((c>='A' && c<='Z') || (c>='a'&& c<='z') || (c>='0' && c<='9'))
            return true;
        return false;
    }
}
