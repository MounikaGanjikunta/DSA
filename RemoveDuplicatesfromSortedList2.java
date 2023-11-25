class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                int duplicateValue = curr.val;
                while (curr != null && curr.val == duplicateValue) {
                    curr = curr.next;
                }
                prev.next = curr;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
