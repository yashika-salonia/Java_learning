import java.util.HashMap;
import java.util.Arrays;

public class twoSum{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int target=10;
        // twoSum ts=new twoSum();
        // ts.bruteSum(arr, target);

        System.out.println(Arrays.toString(optimalSum(arr, target)));
    }
    void bruteSum(int[] arr,int target){
        // outerloop:
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("target found at index: "+i+" and "+j);
                    return;
                    // break outerloop;
                }
            }
        }
    }

    static int[] optimalSum(int[] arr,int target){
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
            
        }
        return new int[] {-1, -1};
    }
}