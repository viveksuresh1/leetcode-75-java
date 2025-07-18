
public class longestSubarray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 1, 0, 1, 1, 1};
        System.out.println(solution.longestSubarray(nums)); // Output: 5
    }
}

class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,right=0,count=0,maxcount=0,z=0;
        boolean checkzero=false;
        while(right < nums.length){
            if(nums[right]==1){
                right++;
                count++;
            }
            else{
                checkzero=true;
                if(z==1){
                    while(nums[left]!=0 && left < nums.length){
                        left++;
                        count--;
                    }
                    left++;
                    z--;
                }
                else{
                    z++;
                    right++;
                }
            }
            maxcount = Math.max(count,maxcount);
        }
        if(checkzero)   return maxcount;
        else return maxcount-1;
    }
}
