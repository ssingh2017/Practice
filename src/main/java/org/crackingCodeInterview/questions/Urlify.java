package org.crackingCodeInterview.questions;

public class Urlify {
    public static void main(String[] args) {
        char [] c = {'M','y',' ','D','o','g',' ',' ',' '};
        int length = 6;
        int i=0;
        while(i<length){
            if(c[i]==' ') {
                c[i] = '%';
            }else{
                i++;
            }

        }




//        StringBuilder str = new StringBuilder("Mr John Smith ");
//        for(int i=0;i<13;i++){
//            if(str.charAt(i)==' ')
//                str.replace(i,i+1,"%20");
//        }
//
//        System.out.println("New String is : "+str);
    }
}
