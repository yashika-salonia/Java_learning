public class mergeSort {
    public static void main(String[] args) {
        int[] arr={5, 2, 9, 1, 5, 6};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        mergeAndSort(arr, 0, arr.length-1);
        
        System.out.println("Sorted array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void mergeAndSort(int[] arr, int left, int right){
        if(left==right) return;
        int mid = left+ (right-left)/2;
        mergeAndSort(arr, left, mid);
        mergeAndSort(arr, mid+1, right);
        merge(arr, left, mid, right);
    }

    void merge(int[] arr, int l, int m, int r){
        int[] left=new int[m-l+1];
        int[] right=new int[r-m];
        int k=l;

        // to pu all values into left
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
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[n]=left[i];
                i++;
                n++;
            }
            else{
                arr[n]=right[j];
                j++;
                n++;
            }
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

    }
}