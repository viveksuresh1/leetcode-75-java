public class mergeStringsAlternately {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String result = sol.mergeAlternately("abc", "pqr");
        System.out.println("Result: " + result);
    }
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int maxlen = Math.max(m, n);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < maxlen; i++) {
            if (i < m) res.append(word1.charAt(i));
            if (i < n) res.append(word2.charAt(i));
        }
        return res.toString();
    }
}
// This code defines a class `MergeStringsAlternately` with a main method that tests the `mergeAlternately` method from the `Solution` class.