

public class goodNodes {
    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(4, new TreeNode(1), new TreeNode(5)));
        Solution solution = new Solution();
        int goodNodesCount = solution.goodNodes(root);
        System.out.println("Good Nodes Count: " + goodNodesCount); // Output: Good Nodes Count: 4
    }
    
}



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
    int count=0;
    public int goodNodes(TreeNode root) {
        dfs(root,root.val);
        return count;
    }
    void dfs(TreeNode node, int maxSoFar) {
    if (node == null) return;
    if (node.val >= maxSoFar) count++; // it's a good node
    dfs(node.left, Math.max(maxSoFar, node.val));
    dfs(node.right, Math.max(maxSoFar, node.val));
}

}