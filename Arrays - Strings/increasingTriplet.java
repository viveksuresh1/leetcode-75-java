public class increasingTriplet {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(solution.increasingTriplet(nums)); // Output: true
    }
    
}

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n;           // smallest so far
            } else if (n <= second) {
                second = n;          // second smallest
            } else {
                return true;         // found third > second > first
            }
        }

        return false;
    }
}