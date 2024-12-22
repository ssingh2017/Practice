package org.example.SortingAlgo;

public class SelectionSort {

    public static void main(String [] args){
        System.out.println("Selection Sorting");

        int arr[] = new int[]{2,4,14,5,1,0};
        int min;
        int k=0;
        for(int i=0;i<arr.length-1;i++){
            min = arr[i];
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<min){
                    arr[i] = arr[j];
                    arr[j] = min;
                    min = arr[i];
                }
            }
        }
        for(int i : arr)
            System.out.print(i +" ");
    }
}
