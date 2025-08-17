import java.util.Arrays;

public class dutch_flag {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,0,0,0,1};
        dutchFlagSort(arr);

    }
    static void dutchFlagSort(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
