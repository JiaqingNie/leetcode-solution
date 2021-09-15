package Q21MergeTwoSortedLists;

import data_structure.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode res = new ListNode();
        ListNode ret = res;

        while (l1 != null || l2 != null) {
            if (l1!= null && l2 != null) {
                if (l1.val < l2.val) {
                    res.val = l1.val;
                    l1 = l1.next;
                } else {
                    res.val = l2.val;
                    l2 = l2.next;
                }

                res.next = new ListNode();
                res = res.next;
            } else if (l1 != null) {
                res.val = l1.val;
                l1 = l1.next;
                if (l1!=null) {
                    res.next = new ListNode();
                    res = res.next;
                }
            } else {
                res.val = l2.val;
                l2 = l2.next;
                if (l2!=null) {
                    res.next = new ListNode();
                    res = res.next;
                }
            }
        }

        return ret;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        Solution solution = new Solution();
        System.out.println(solution.mergeTwoLists(l1, l2));
    }
}