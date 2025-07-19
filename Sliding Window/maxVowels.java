
public class maxVowels {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abciiidef";
        int k = 3;
        int result = solution.maxVowels(s, k);
        System.out.println("Max Vowels: " + result); // Output: 3
    }    
}

class Solution {
    public int maxVowels(String s, int k) {
        int count = 0, maxcount = 0;
        String vowels = "aeiou";

        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count++;

            if (i >= k) {
                if (vowels.indexOf(s.charAt(i - k)) != -1) count--;
            }

            maxcount = Math.max(maxcount, count);
        }

        return maxcount;
    }
}
