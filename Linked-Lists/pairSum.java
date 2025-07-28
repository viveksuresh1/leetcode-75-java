

public class pairSum {
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        

        Solution solution = new Solution();
        int result = solution.pairSum(head);

        // Print the result
        System.out.println(result); // Output: 6
    }
    
}



class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public int pairSum(ListNode head) {
        int sum=0;
        ListNode slow=head,fast=head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // Reverse the second half of the list
        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        while(prev!=null){
            sum = Math.max(sum,head.val+prev.val);
            prev = prev.next;
            head = head.next;
        }
        return sum;
    }
}
