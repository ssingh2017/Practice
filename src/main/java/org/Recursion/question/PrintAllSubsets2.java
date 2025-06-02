package org.Recursion.question;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets2 {

    static List<List<Integer>> list = new ArrayList<>();
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<Integer> input = new ArrayList<>();
        for(int num : nums)
            input.add(num);

        List<Integer> output = new ArrayList<>();

        generateAllSubset(input,output);
        System.out.println("output "+list);
    }


    private static void generateAllSubset(List<Integer> input,List<Integer> output){

        if(input.isEmpty()){
            list.add((output));
            return;
        }
        List<Integer> output1 = output;
        List<Integer> output2 = output;

        output2.add(input.get(0));
        input.remove(0);
        System.out.println("output2 "+output2);
        generateAllSubset(input,output1);
        generateAllSubset(input,output2);


    }
}
