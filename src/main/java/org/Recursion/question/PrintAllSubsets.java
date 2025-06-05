package org.Recursion.question;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets {


    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("output: "+subsets(nums));
    }

    private static List<List<Integer>> subsets(int[] nums){
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();
        generateAllSubset(nums,0,current,output);
        return output;
    }

    private static void generateAllSubset(int [] nums,int i,List<Integer> current,List<List<Integer>> output){
        if(i== nums.length ){
            if(!output.contains(current))
                output.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        generateAllSubset(nums,i+1,current,output);

        current.remove(current.size()-1);
        generateAllSubset(nums,i+1,current,output);
    }
}
