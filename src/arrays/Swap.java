package arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        //swapping 2 terms only
        int[] arr={1,2,3,4,5,7,9,8};
//        swap(arr,1,4);
//        reversearr(arr);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }

    //now reversing an array using swapping
    static void reversearr(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }

    //using 2 pointer approach
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
