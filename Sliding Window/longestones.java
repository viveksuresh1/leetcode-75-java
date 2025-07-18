

public class longestones {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 0, 1, 1, 0, 1, 1};
        int k = 2;
        int result = solution.longestOnes(nums, k);
        System.out.println("Longest Ones: " + result); // Output: 6
    }
    

}

class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,count=0,z=k,maxcount=0;
        while(right<nums.length){
            if(nums[right]==1){
                right++;
                count++;
            }
            else{
                if(z>0){
                    right++;
                    count++;
                    z--;
                }
                else{
                    while(nums[left]!=0 && left<nums.length-1){
                        left++;
                        count--;
                    }
                    z++;
                    left++;
                    count--;
                }
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
}
