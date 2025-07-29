
public class maxDepth {
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        Solution solution = new Solution();
        int depth = solution.maxDepth(root);
        System.out.println("Max Depth: " + depth); // Output: Max Depth: 2
    }
    
    
}



// Definition for a binary tree node.
class TreeNode {
    int val;     
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        int max=0;
        if(root == null)    return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1+Math.max(left,right);
    }
}