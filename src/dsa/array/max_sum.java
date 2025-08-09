import java.util.ArrayList;

public class max_sum {
    public static void main(String[] args) {
        int[] arr={-1,2,-1,4,-1,5,-2,1,-3};
        maxSum(arr);
    }
    static ArrayList<Integer> subArr=new ArrayList<>();
    static void maxSum(int[] arr){
        int max=Integer.MIN_VALUE;
        int start=0,end=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if(sum>max){
                        max=sum;
                        start=i;
                        end=j;

                    }
                }
            }
        }
        System.out.println("Sum: "+max);
        for(int i=start;i<=end;i++){
            subArr.add(arr[i]);
        }
        System.out.println("Subarray: "+subArr);
    }
}
