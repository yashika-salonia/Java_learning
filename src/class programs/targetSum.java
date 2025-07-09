import java.util.Arrays;

public class targetSum {
    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        System.out.println(twoSum(nums,target));
    }
    public static int[] twoSum(int[] nums, int target) {
            int[] ans=new int[2];
            System.out.println(Arrays.toString(ans));
             for(int i=0;i<nums.length;i++){
                 for(int j=i+1;j<nums.length;j++){
                     if(nums[i]+nums[j]==target){
                         ans[0]=i;
                         ans[1]=j;
                     }
                 }
             }
            return ans;
    }
}
