/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr = node;
        while(curr.next!= null){
            curr.val = curr.next.val;
            curr = curr.next;
        }
        while(node.next!= curr){
            node = node.next;
        }
        node.next = null;
    }
}
