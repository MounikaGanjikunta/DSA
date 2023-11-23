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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp!= null){
            temp = temp.next;
            size++;
        }

        while(k > size){
            k = k % size;
        }

        System.out.println(size);
        
        while(k > 0){
            ListNode dummy = head;
            while(dummy.next.next!= null){
                dummy = dummy.next;
            }
           // System.out.println(dummy.val);
            ListNode newHead = dummy.next;
            dummy.next.next = head;
            dummy.next = null;
            head = newHead;
            k--;
        }
        

    return head;
    }
}
