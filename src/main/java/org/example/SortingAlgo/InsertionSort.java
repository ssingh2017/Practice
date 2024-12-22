package org.example.SortingAlgo;

public class InsertionSort {
    public static void main(String [] args){
        int a[] = new int[]{6,8,1,4,5,3,7,2};
        int start;
        int end =0;
        int k = end +1;
        while( k<a.length){
            if(a[end]< a[k]){
                end =k;
                k++;
            }else{
                sort(a,k);
                end =k;
                k++;

            }
        }

        for(int x : a){
            System.out.print(x+" ");
        }
    }

    public static void sort(int a[], int end){
        for(int i=end-1;i>=0;i--){
            if(a[i]>a[end]){
                int t = a[end];
                a[end] = a[i];
                a[i] = t;
                end--;
            }else{
                break;
            }
        }
    }
}
