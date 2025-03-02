package arrays;
import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("Count: " + count);
    }
    static int count = 0;
    static void quickSort(int arr[], int p, int q) {
        if (p < q) {
            int j = partition(arr, p, q+1);
            quickSort(arr, p, j - 1);
            quickSort(arr, j + 1, q);
        }
    }
    static int partition(int[] arr, int m, int p) {
        int v=arr[m];
        int i=m; //left
        int j=p; //right
        do{
            count++;
            do{
                count++;
                i++;
                count++;
            }while(i<arr.length && arr[i]<v);
            do{
                count++;
                j--;
                count++;
            }while(arr[j]>v);
            if(i<j){
                count++;
                int temp=arr[j];
                count++;
                arr[j]=arr[i];
                count++;
                arr[i]=temp;
                count++;
            }
            count++;
        }while(i<j);
        arr[m]=arr[j];
        arr[j]=v;
        return j;
    }
}
