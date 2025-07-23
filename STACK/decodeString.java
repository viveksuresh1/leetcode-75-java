package STACK;
import java.util.Stack;

public class decodeString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "3[a2[c]]";
        String result = solution.decodeString(s);
        System.out.println("Decoded string: " + result); // Output: "accaccacc"
    }
}


class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(curr);
                curr = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decoded = stringStack.pop();
                int repeat = countStack.pop();
                while (repeat-- > 0) {
                    decoded.append(curr);
                }
                curr = decoded;
            } else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}
