/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode findReverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode middle = findMiddle(head);
        ListNode startOfSecondHalf = findReverse(middle.next);

        ListNode firstHalfHead = head;
        while(startOfSecondHalf != null){
            if(firstHalfHead.val != startOfSecondHalf.val){
                return false;
            }else{
                firstHalfHead = firstHalfHead.next;
                startOfSecondHalf = startOfSecondHalf.next;
            }
        }

        return true;


        
    }
}
