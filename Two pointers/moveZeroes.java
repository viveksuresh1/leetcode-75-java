
public class moveZeroes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " "); // Output: 1 3 12 0 0
        }
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int num: nums){
            if(num!=0) {
                nums[index] = num;
                index++;
            }
        }

        while(index<nums.length){    
            nums[index] = 0;
            index++;
        }
    }
}