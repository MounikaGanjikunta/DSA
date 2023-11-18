//Test cases 24/44 passes
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }

        ListNode temp = head;
        ListNode tempright = head;
        int count = 1;
        while(temp != null){
            if(count == left){
                break;
            }else{
                temp = temp.next;
                count++;
            }
        }
        count = 1;

        while(tempright != null){
            if(count == right){
                break;
            }else{
                tempright = tempright.next;
                count++;
            }
        }
       // tempright = tempright.next;

        ListNode prev = temp;
        ListNode curr = temp.next;
        // System.out.println(curr.val);
        // System.out.println(tempright.val);
        while(curr != tempright){
            ListNode nextNode = curr.next;
            // System.out.println('1');
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        // System.out.println(curr.val);
        temp.next = curr.next;
        // System.out.println(curr.next.val);
        curr.next = prev;
        if(right - left > 1){
            head.next = tempright;
            return head;
        }else{
            head = tempright;
            return head;
        }

    }
}
