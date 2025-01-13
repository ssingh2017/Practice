package org.example.searching.algo;

public class BinarySearch {

    public static void main(String [] args){
        int a[] = new int[]{3,6,9,12,15,19};
        int key = 10;
        int start = 0;
        int end = a.length-1;
        System.out.println("value is present at position -- "+binarySearch(a,start,end,key));
       ;
    }

    public static int binarySearch(int [] a,int start, int end ,int k){
        while(end>=start) {
            int middle = (start + end) / 2;
            //System.out.println("start - "+start +" middle - "+middle +" end - "+end);
//        if(start>end)
//            return -1;
            if (a[middle] == k) {
                System.out.println("value is present at position " + middle);
                return middle;
            }
            if (k < a[middle])
                return binarySearch(a, start, middle - 1, k);
            return binarySearch(a, middle + 1, end, k);
        }
        return -1;
    }
}
