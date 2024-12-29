package org.example.array.hashing;

import java.util.*;

public class TopKFrequentElement {
    public static void main(String [] args){
        int [] nums = {7,7};
        //int [] nums = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int k =1;
        int res [] =topKFrequent(nums,k);
        for(int i : res)
            System.out.print(i+" ");
    }

    private static int[] topKFrequent(int[] nums, int k) {
        int [] res = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int element : nums){
            if(map.containsKey(element)){
                int count = map.get(element);
                map.put(element,++count);
            }else
                map.put(element,1);
        }
       System.out.println("map is "+map);
        //First way
            //solvedByFindMaxInMap(k, map, res);

        //Second Way using bucket sort
        List<Integer> [] countOfValues = new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("entry "+entry);
            List<Integer> list  = new ArrayList<>();
           if(countOfValues[entry.getValue()] != null){
              list = countOfValues[entry.getValue()];
           }
           list.add(entry.getKey());
            countOfValues[entry.getValue()] = list;
           // System.out.println("list "+list +" key "+entry.getKey()+" value "+entry.getValue());
        }


//        for(List<Integer> e : countOfValues)
//            System.out.print(e+" ");
        int count =0;
        for(int i=countOfValues.length-1;i>0;i--){
            if(countOfValues[i]!=null){
                List<Integer> list = countOfValues[i];
                for(int j=0;j<list.size();j++){
                    if(count<k) {
                        res[count] = list.get(j);
                        count++;
                    }else
                        break;
                }
            }
        }

        return res;
    }

    private static void solvedByFindMaxInMap(int k, HashMap<Integer, Integer> map, int[] res) {
        for(int i = 0; i< k; i++) {    // O(kn)
            Map.Entry<Integer, Integer> maxEntry = null;
            int key;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                    maxEntry = entry;
                }
            }
            if(maxEntry!=null) {
                key = maxEntry.getKey();
                res[i] = key;
                map.put(key, 0);
            }
        }
    }
}
