import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class findDifference {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result = sol.findDifference(nums1, nums2);
        System.out.println("Difference: " + result);
    }
}


class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2= new ArrayList<>();
        for (int num : set1)
            if (!set2.contains(num)) diff1.add(num);
        for(int num:set2)
            if(!set1.contains(num)) diff2.add(num);        
        return Arrays.asList(diff1,diff2);
    }
}