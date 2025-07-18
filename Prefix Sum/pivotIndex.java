
public class pivotIndex {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = solution.pivotIndex(nums);
        System.out.println("Pivot Index: " + result); // Output: 3
    }
}


class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int l_sum=0,r_sum=0;
        for(int i=0;i<nums.length;i++){
            r_sum += nums[i];
        }
        
        while(left<nums.length){
            
            if(left>0)  l_sum += nums[left-1];
            if(left<nums.length) r_sum -= nums[left];
            if(l_sum==r_sum)    return left;
            left++;
        }
        return -1;
    }
}