
import java.util.Stack;

public class asteroidCollission {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] asteroids = {5, 10, -5};
        int[] result = solution.asteroidCollision(asteroids);
        System.out.print("Resulting asteroids: ");
        for (int asteroid : result) {
            System.out.print(asteroid + " ");
        }
        // Output: Resulting asteroids: 5 10
    }
}

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
