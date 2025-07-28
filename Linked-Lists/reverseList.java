
public class reverseList {

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode result = solution.reverseList(head);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null) return head;
        ListNode temp = null,prev = head, next = head.next;
        prev.next = null;
        while(next!=null){
            temp = next.next;
            next.next = prev;
            prev = next;
            next = temp;
        }
        head = prev;
        return head;
    }
}
