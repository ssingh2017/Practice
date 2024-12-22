package org.example.questions;

public class SearchInTwoD {
    public static void main(String args[]){
//    int arr[][] ={
//            {1,2,4,8},
//            {10,11,12,13},
//            {14,20,30,40}
//    };
        int arr[][] ={
                {1},{3}
        };
//    int key =3;
//    int i=0;
//    System.out.println("array size "+arr.length);
//    while(i<arr.length){
//        int k = arr[i].length;
//        System.out.println("k "+k);
//        //for(int j=0;j<k && i<arr.length;j++){
//             if (key<=arr[i][k-1]) {
//                int start =0;
//                int end =k-1;
//                while(start<=end){
//                    int middle = (start+end)/2;
//                    if(key== arr[i][middle]) {
//                        System.out.println("value exists");
//                        return;
//                    }
//                    else if (key < arr[i][middle]) {
//                        end = middle-1;
//                    } else {
//                        start = middle+1;
//                    }
//                }
//            }else{
//                ++i;
//            }
//        //}
//    }

       System.out.println("result is "+searchMatrix(arr,3));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int m = matrix.length;
        while(i<m){
            int n = matrix[i].length;
                if(target<=matrix[i][n-1]){
                    int start = 0;
                    int end = n-1;
                    while(start<=end){
                        int middle = (start+end)/2;
                        if(matrix[i][middle] == target)
                            return true;
                        else if(target < matrix[i][middle]){
                            end = middle-1;
                        }else{
                            start = middle+1;
                        }
                    }
                    i++;
                }else{
                    i++;
                }
        }
        return false;
    }

}
