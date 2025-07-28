

public class oddEvenList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        ListNode result = solution.oddEvenList(head);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    
}

class Solution {
        static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode curr=head.next,prev=head,evenHead = curr;
        while(curr!=null && curr.next!=null){
            prev.next = curr.next;
            prev = prev.next;
            curr.next = prev.next;
            curr = curr.next;
        }
        prev.next = evenHead;
        return head;
    }
}
