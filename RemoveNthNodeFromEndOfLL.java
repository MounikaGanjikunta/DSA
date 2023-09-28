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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currNode = head;
        ListNode curr = head;
        int size = 0;
        int i = 1;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        
        int nodeLast = size - n + 1;//4
       
        if (n == size) {
            return head.next;
        }

        while(i < nodeLast - 1){
            curr = curr.next;
            i++;
        }
        
        curr.next = curr.next.next;
        
        


        return head;
        
    }
}
