
public class isSubsequence {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = solution.isSubsequence(s, t);
        System.out.println("Is Subsequence: " + result); // Output: true
    }
}

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        int i=0,j=0,count=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
                count++;
            }
            else    j++;
        }
        if(count == s.length()) return true;
        return false;
    }
}