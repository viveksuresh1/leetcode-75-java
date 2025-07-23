package QUEUES;
import java.util.ArrayDeque;
import java.util.Deque;
public class predictPartyVictory {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String senate = "RDD";
        String result = solution.predictPartyVictory(senate);
        System.out.println("Winning party: " + result); // Output: "Dire"
    }
    
}

class Solution {
    public String predictPartyVictory(String senate) {
        Deque<Integer> qr = new ArrayDeque<>();
        Deque<Integer> qd = new ArrayDeque<>();
        int n = senate.length();
        for (int i=0; i<n; i++) {
            if (senate.charAt(i) == 'D') qd.offerLast(i);
            else qr.offerLast(i);
        }

        while(!qr.isEmpty() && !qd.isEmpty()){
            if(qr.peekFirst() < qd.peekFirst()){
                qr.offerLast(qr.pollFirst() + n);
                qd.pollFirst();
            } else{
                qd.offerLast(qd.pollFirst() + n);
                qr.pollFirst();
            }
        }
        return qd.isEmpty() ? "Radiant" : "Dire";
    }
}