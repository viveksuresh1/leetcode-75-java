
package STACK;
import java.util.Stack;
public class removeStars {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "leet**c**o**de";
        String result = solution.removeStars(s);
        System.out.println("Result after removing stars: " + result); // Output: "leetcode"
    }
    
}

class Solution{
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}