import java.util.Arrays;

public class arrayRev{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int start=0, end=n-1;
        for(int i=0;i<n/2;i++){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}