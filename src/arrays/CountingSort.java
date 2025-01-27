package arrays;
import java.util.*;
public class CountingSort {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter n: ");
            int n=sc.nextInt();
            int[] A=new int[n];
            //input array
            System.out.print("Enter array elements: ");
            for(int i=0;i<n;i++){
                A[i]=sc.nextInt();
            }
            int max=0;
            for(int i=0;i<A.length;i++){
                if(max<A[i]){
                    max=A[i];
                }
            }
            int[] B=new int[A.length];
            int[] C=new int[max+1];
            countSort(A,B,C,max);
        }

        static void countSort(int[] A,int[] B, int[] C, int k){
            int count=0;
            //   for(int i=0;i<=k;i++){
            //       count++;
            //       C[i]=0;
            //       count++;
            //   }
            //   count++;
            for(int i=0;i<A.length;i++){
                count++;
                C[A[i]]=C[A[i]]+1;
                count++;
            }
            count++;
            for(int i=1;i<=k;i++){
                count++;
                C[i]=C[i]+C[i-1];
                count++;
            }
            count++;
            for(int j=A.length-1;j>=0;j--){
                count++;
                B[ C[ A[j] ] -1 ]=A[j];
                count++;
                C[A[j]]=C[A[j]]-1;
                count++;
            }
            count++;
            for(int i=0;i<B.length;i++){
                System.out.print(B[i]+" ");
            }
            System.out.println();
            System.out.println("Count: "+count);
        }
}
