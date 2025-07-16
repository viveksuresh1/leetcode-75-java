public class canPlaceFlowers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        boolean result = sol.canPlaceFlowers(flowerbed, n);
        System.out.println("Can place flowers: " + result); // Output: true
    }
    
}

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
            int left = (i==0)?0: flowerbed[i-1];
            int right = (i==flowerbed.length-1)?0: flowerbed[i+1];
            if(left==0 && right==0){
                count++;
                if(count>=n)    return true;
                i++;
            }
            }
        }
        return count>=n;
    }
}