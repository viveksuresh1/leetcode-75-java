public class reverseWords {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String result = sol.reverseWords("the sky is blue");
        System.out.println("Reversed Words: " + result); // Output: "blue is sky the"
    }
    
}

class Solution {
 public String reverseWords(String s) {
        char[] charArr = s.toCharArray();
        int size = charArr.length;
        char result[] = new char[size];
        int index = 0;
        int end = size - 1;

        while (end >= 0) {
            while (end >= 0 && charArr[end] == ' ') {
                end --;
            }
            int start = end;

            while (start >= 0 && charArr[start] != ' ') {
                start --;
            }

            if (index > 0) {
                result[index++] = ' ';
            }

            for (int i = start + 1; i <= end; i ++) {
                result[index++] = charArr[i];
            }

            end = start - 1;
        }

        return new String(result, 0, index).trim();
    }
}