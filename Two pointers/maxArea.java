

public class maxArea {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        System.out.println("Max Area: " + result); // Output: 49
    }
}


class Solution {
    public int maxArea(int[] height) {
        int area=Integer.MIN_VALUE, start=0, end=height.length-1; 
        while(start<end){
            int temp_area = (end-start) * (Math.min(height[start],height[end]));
            if(temp_area>area)  area = temp_area;
            if(height[start]<height[end])   start++;
            else    end--; 
        } 
        return area;
    }
}