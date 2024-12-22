package org.example.SortingAlgo;

public class MergeSort {

    public static void main(String [] args){
        int a [] = new int[]{3,5,1,7};
            divide(a,0,a.length-1);

            for(int x : a)
                System.out.print(x+" ");
    }

    public static void divide(int a[],int start, int end){
        if(start<end){
            int m = (end - start)/2 +start;
            System.out.println("1st --start -"+start +" m -"+m+" end -"+end);
            divide(a,start,m);
            System.out.println("2nd --start -"+start +" m -"+m+" end -"+end);
            divide(a,m+1,end);
            System.out.println("3rd --start -"+start +" m -"+m+" end -"+end);

            merge(a,start,m,end);
        }
    }

    public static void merge(int arr[],int l, int m , int r){

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }




    }
}
