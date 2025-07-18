
public class findMaxAverage {
        public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = solution.findMaxAverage(nums, k);
        System.out.println("Max Average: " + result); // Output: 12.75
    }
    
}

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int max = sum;

        for(int i=k;i<nums.length;i++){
            sum = sum+nums[i]-nums[i-k];
            max = Math.max(max,sum);
        }
        return (double)max/k;
    }
}


class Solution2 {
    static int[] count = new int[26];
    static{
        count['a'-'a']=count['e'-'a']=count['i'-'a']=count['o'-'a']=count['u'-'a']=1;
        for (int i = 0; i < 500; i++) {
            maxVowels("",0);
        }
    }
    public static int maxVowels(String s, int k) {
        int n=s.length();
        int maxV=0;
        for(int end = 0;end<k;end++){
            maxV+=count[s.charAt(end)-'a'];
        }
        int curr=maxV;
        for(int end=k;end<n;end++){
            curr+=count[s.charAt(end)-'a']-count[s.charAt(end-k)-'a'];
            if(maxV<curr)
                maxV=curr;
        }
        return maxV;
    }
}