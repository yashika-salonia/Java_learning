public class maxElm {
    public static void main(String[] args) {
        int[] arr={5,10,12,7,3,9};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max: "+max);
    }
}
