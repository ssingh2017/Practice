package org.Recursion.question;

import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
    public static void main(String[] args) {
        int n=5;
        int k=2;
        List<Integer> listOfPerson = new ArrayList<>();
        for(int i=0;i<n;i++){
            listOfPerson.add(i+1);
        }
        findAlivePerson(listOfPerson,k-1,0);

    }
    private static void findAlivePerson(List<Integer> listOfPerson,int k,int index){
       if(listOfPerson.size()==1){
           System.out.println(listOfPerson.get(0));
           return;
       }
        int deadIndex = (index+k)% listOfPerson.size();
       listOfPerson.remove(deadIndex);
       findAlivePerson(listOfPerson,k,deadIndex);

    }
}
