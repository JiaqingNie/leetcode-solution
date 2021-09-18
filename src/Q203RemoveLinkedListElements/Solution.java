package Q203RemoveLinkedListElements;

import DataStructureUtils.ListNode;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        } else {
            ListNode pointer = new ListNode(0, head);
            ListNode res = pointer;
            while (pointer.next != null) {
                if (pointer.next.val == val) {
                    pointer.next = pointer.next.next;
                }  else {
                    pointer = pointer.next;
                }
            }
            return res.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        Solution solution = new Solution();
        ListNode res = solution.removeElements(head, 6);
        while (res != null) {
            System.out.print(res.val +" ");
            res = res.next;
        }
    }
}
