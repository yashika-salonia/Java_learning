package arrays;

public class maxInArr {
    public static void main(String[] args) {
        int arr[]={56,87,43,97,45,23};
        System.out.println(max(arr));
    }
    static int max(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int maxno=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxno<arr[i]){
                maxno=arr[i];
            }
        }
        return maxno;
    }
}
