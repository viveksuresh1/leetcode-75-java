
public class maxOperations {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        int result = solution.maxOperations(nums, k);
        System.out.println("Max Operations: " + result); // Output: 2
    }
    
}

class Solution {
    public int maxOperations(int[] nums, int k) {
        int ops = 0, n=0,i=0,j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            int sum = (nums[i]+nums[j]);
            if(sum==k){
                ops++;
                i++;j--;
            }
            else if(sum<k)   i++;
            else    j--;
        }
        return ops;
    }
}