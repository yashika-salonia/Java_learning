package arrays;
import java.util.Scanner;
public class SortingComplexity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        //input array
        System.out.print("Enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //printing array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int count=0;
        for(int i=1;i<n;i++){
            count++;
            int key=arr[i];
            count++;
            int j=i-1;
            count++;
            while(j>=0 && arr[j]>key){
                count++;
                arr[j+1]=arr[j];
                count++;
                j--;
                count++;
            }
            count++;
            arr[j+1]=key;
            count++;
        }
        count++;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println(count);
    }
}
