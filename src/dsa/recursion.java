package dsa;

import java.util.Arrays;

// import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=6;
        // int sum=0;
        // sumN(n,sum);
        // System.out.println(sumN(n));
        // System.out.println(factorialN(n));

        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(revArr(arr, 0,arr.length-1)));
    }
    
    // Parameterized recursion
    static void sumN(int i,int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        sumN(i-1,sum+i);
    }

    // Functional recursion
    static int sumN(int n){
        if(n==0){
            return 0;
        }
        return n+sumN(n-1);
    }

    // factorial recursion
    static int factorialN(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n* factorialN(n-1);
    }

    //array reversal through recursion
    static int[] revArr(int[] arr, int start, int end){
        if(start>=end){
            return arr;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        return revArr(arr, start+1, end-1);
    }
}


