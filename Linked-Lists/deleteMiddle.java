public class deleteMiddle{

    // Make ListNode static so it's usable from static methods
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
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
        ListNode modifiedHead = solution.deleteMiddle(head);

        // Print the modified list
        ListNode current = modifiedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    static class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }
            ListNode slow = head;
            ListNode fast = head;
            ListNode prev = null;

            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            prev.next = slow.next;
            return head;
        }
    }
}
