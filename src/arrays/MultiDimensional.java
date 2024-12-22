package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
//        int[][] arr=new int[3][];
//        int[][] arr1={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//
//        //input
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter no of rows: ");
//        int rows=sc.nextInt();
//        System.out.println("enter no of columns: ");
//        int col=sc.nextInt();
//        int[][] arr2=new int[rows][col];
//        for(int i=0;i<rows;i++){
//            for(int j=0;j<col;j++){
//                System.out.println("enter elm at index "+i+" "+j);
//                arr2[i][j]=sc.nextInt();
//            }
//        }
//
//        //printing
////        for(int i=0;i<rows;i++){
////            for(int j=0;j<col;j++){
////                System.out.print(arr2[i][j]+" ");
////            }
////            System.out.println();
////        }
//
//        //with enhanced for loop - most simple method
//        for(int[] i:arr2){
//            System.out.println(Arrays.toString(i));
//        }

        //jagged array
        int[][] jag ={
                {1,2,3},
                {4,5,6,7},
                {8,9}
        };

        for(int i = 0 ; i < jag.length; i++) {
            for(int j=0;j< jag[i].length ;j++){
                System.out.print(jag[i][j]+" ");
            }
            System.out.println();
        }

    }
}
