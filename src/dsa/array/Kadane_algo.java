import java.util.ArrayList;

public class Kadane_algo {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        // maxSum(arr);
        kadane_app(arr);
    }
    static ArrayList<Integer> subArr=new ArrayList<>();
    static void maxSum(int[] arr){
        int max=Integer.MIN_VALUE;
        // int start=0,end=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                // brute force
                // for(int k=i;k<=j;k++){
                //     sum+=arr[k];
                //     if(sum>max){
                //         max=sum;
                //         start=i;
                //         end=j;

                //     }
                // }

                max=Math.max(sum, max);
            }
        }
        System.out.println("Sum: "+max);
        // for(int i=start;i<=end;i++){
        //     subArr.add(arr[i]);
        // }
        // System.out.println("Subarray: "+subArr);
    }

    static void kadane_app(int[] arr){
        int max=Integer.MIN_VALUE;
        int sum=0, ansS=-1,ansE=-1,start=0;
        for(int i=0;i<arr.length;i++){
            if(sum==0){
                start=i;
            }
            sum+=arr[i];
            if(sum>max){
                max=sum;
                ansS=start;
                ansE=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=ansS;i<=ansE;i++){
            subArr.add(arr[i]);
        }
        System.out.println("Subarray: "+subArr);
        System.out.println("Max Sum: "+max);
    }
}
