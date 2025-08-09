import java.util.Arrays;
public class next_permutation {
    
    public static void main(String[] args) {
        int[] nums={3,4,1,6,0,0};
        nextPermutation(nums);
    }

    static void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;

        // Find the break point:
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }

        // If break point does not exist:
        if(idx==-1){
            // reverse the whole array:
            reverse(nums,0,n-1);
            return;
        }

        // Find the next greater element and swap it with arr[ind]:
        for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
                break;
            }
        }

        // reverse the right half:
        reverse(nums,idx+1,n-1);
        
        System.out.println(Arrays.toString(nums));
    }

    // reverse method
    static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
