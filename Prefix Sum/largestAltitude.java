

public class largestAltitude {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] gain = {-5, 1, 5, 0, -7};
        int result = solution.largestAltitude(gain);
        System.out.println("Largest Altitude: " + result); // Output: 1
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int max=0,sum=0;
        for(int i=0;i<gain.length;i++){
            sum += gain[i];
            max = Math.max(max,sum);
        }
        return max;
    }
}