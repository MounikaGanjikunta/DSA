class HelloWorld {

    public class ListNode {
        int val;
        ListNode next;
        ListNode bottom;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next, ListNode bottom) {
            this.val = val;
            this.next = next;
            this.bottom = bottom;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempNode = new ListNode(0);
        ListNode cur = tempNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.bottom = list1;
                list1 = list1.bottom;
            } else {
                cur.bottom = list2;
                list2 = list2.bottom;
            }
            cur = cur.bottom;
        }

        if (list1 != null) {
            cur.bottom = list1;
        } else if (list2 != null) {
            cur.bottom = list2;
        }

        return tempNode.bottom;
    }

    public ListNode flatten(ListNode root) {
        if (root == null || root.next == null) {
            return root;
        }

        root.next = flatten(root.next);
        root = mergeTwoLists(root, root.next);
        return root;
    }

    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();

        ListNode[] lists = new ListNode[4];

        // Sorted linked list 1
        ListNode node1 = obj.new ListNode(1);
        ListNode node2 = obj.new ListNode(3);
        ListNode node3 = obj.new ListNode(5);

        node1.next = node2;
        node2.next = node3;

        lists[0] = node1;

        // Sorted linked list 2
        ListNode node4 = obj.new ListNode(2);
        ListNode node5 = obj.new ListNode(4);

        node4.next = node5;

        lists[1] = node4;

        // Sorted linked list 3
        ListNode node6 = obj.new ListNode(6);
        ListNode node7 = obj.new ListNode(8);

        node6.next = node7;

        lists[2] = node6;

        // Sorted linked list 4
        ListNode node8 = obj.new ListNode(7);
        ListNode node9 = obj.new ListNode(9);

        node8.next = node9;

        lists[3] = node8;
        ListNode result = obj.flatten(node1);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.bottom;
        }

    }
}
