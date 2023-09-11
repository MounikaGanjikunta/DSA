/* 
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1] */
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
        if(head == null || head.next == null){
            return null;
        }
        int size = 0;

        ListNode currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }

        if(size == n){
            return head.next;
        }

        int nth = size - n;
        ListNode curr = head;
        int i = 1;
        while(i < nth){
            curr = curr.next;
            i++;
        }

        curr.next = curr.next.next;
        return head;
}
}
