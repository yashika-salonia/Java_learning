public class count_inversion {
    public static void main(String[] args) {
        // int[] arr={5, 2, 9, 1, 5, 6};
        int arr[] ={5,3,2,4,1};

        count_inversion ms=new count_inversion();
        System.out.print("count: "+ms.mergeAndSort(arr, 0, arr.length-1));
        
    }

    int mergeAndSort(int[] arr, int left, int right){
        int cnt=0;
        if(left>=right) return 0;
        int mid = left+ (right-left)/2;
        cnt+=mergeAndSort(arr, left, mid);
        cnt+=mergeAndSort(arr, mid+1, right);
        cnt+=merge(arr, left, mid, right);
        return cnt;
    }

    int merge(int[] arr, int l, int m, int r){
        
        int[] left=new int[m-l+1];
        int[] right=new int[r-m];
        int k=l;

        // to put all values into left
        for(int i=0;i<left.length;i++){
            left[i]=arr[k];
            k++;
        }

        // to fill right arr
        for(int i=0;i<right.length;i++){
            right[i]=arr[k];
            k++;
        }

        // merge them in arr
        int i=0, j=0, n=l;
        int cnt=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[n]=left[i];
                i++;
            }
            else{
                arr[n]=right[j];
                cnt+=left.length-i;
                j++;
            }
            n++;
        }
        while(i<left.length){
            arr[n]=left[i];
            i++;
            n++;
        }
        while(j<right.length){
            arr[n]=right[j];
            j++;
            n++;
        }
        return cnt;
    }
}