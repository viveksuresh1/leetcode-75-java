import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class equalPairs {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {{1,2,3},{4,5,6},{7,8,9}};
        int result = solution.equalPairs(grid);
        System.out.println("Equal Pairs: " + result); // Output: 0
    }
    
}

class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>,Integer> hmap = new HashMap<>();
        int n = grid.length;
        for(int i=0;i<n;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(grid[i][j]);
            }
            hmap.put(row,hmap.getOrDefault(row,0)+1);
        }
        int count = 0;
        for(int i=0;i<n;i++){
            List<Integer> col = new ArrayList<>();
            for(int j=0;j<n;j++){
                col.add(grid[j][i]);
            }
            count += hmap.getOrDefault(col,0);
        }
        return count;
    }
}