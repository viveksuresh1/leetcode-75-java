import java.util.ArrayList;
import java.util.List;
public class kidsWithCandies {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(solution.kidsWithCandies(candies, extraCandies)); // Output: [true, true, true, false, true]
    }
    
}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxcandies = 0;
        for (int candy : candies) {
            if (candy > maxcandies) 
                maxcandies = candy;
        }
        for (int candy : candies)
            result.add(candy + extraCandies >= maxcandies);
        return result;
    }
}