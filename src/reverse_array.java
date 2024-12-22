public class reverse_array {
    // static void Reversearr(int arr[]){
    //two pointer approach
    // int left=0,right=arr.length-1;
    // while(left<right){
    //     int temp=arr[left];
    //     arr[left]=arr[right];
    //     arr[right]=temp;
    //     left++;
    //     right--;
    // }

    //direct swaping in 1st half with 2nd half
    // int n=arr.length;
    // for(int i=0;i<n/2;i++){
    //     int temp=arr[i];
    //     arr[i]=arr[n-i-1];
    //     arr[n-i-1]=temp;
    // }
    // }

    //using recursion
    static void ReverseRec(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        ReverseRec(arr, l+1, r-1);
    }


    static void Reversearr(int[] arr){
        int n=arr.length;
        ReverseRec(arr, 0, n-1);
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Reversearr(arr);
        // ReverseRec(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}