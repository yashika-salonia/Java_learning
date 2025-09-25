public class search {
    public static void main(String[] args) {
        int target=10;
        int[] arr={2,4,7,10,15};
        int n=arr.length;
        int start=0, end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("Found at index: "+mid);
                return;
            } else if(arr[mid]<target){
                start=mid+1;
            } else {
                end=mid-1;
            }
        }
        System.out.println("Not found");
    }
}
