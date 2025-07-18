import java.util.HashMap;
import java.util.HashSet;

public class uniqueOccurences {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean result = solution.uniqueOccurrences(arr);
        System.out.println("Unique Occurrences: " + result); // Output: true
    }
    
}

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hmap= new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            hmap.put(num,hmap.getOrDefault(num,0)+1);
        }
        for(int count:hmap.values())
            set.add(count);
        return set.size() == hmap.size();
    }
}
