package Q23MergeKSortedLists;

import DataStructureUtils.ListNode;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        } else if (!isNotEmpty(lists)) {
            return null;
        }
        ListNode res = new ListNode();
        ListNode ret = res;
        while (isNotEmpty(lists)) {

            int minIdx = -1;
            int min = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (minIdx == -1) {
                        minIdx = i;
                        min = lists[i].val;
                    } else if (min > lists[i].val) {
                        min = lists[i].val;
                        minIdx = i;
                    }

                }
            }

            res.val = min;
            lists[minIdx] = lists[minIdx].next;

            if (isNotEmpty(lists)) {
                res.next = new ListNode();
                res = res.next;
            }

        }

        return ret;
    }

    public boolean isNotEmpty(ListNode[] lists) {
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1, new ListNode(4, new ListNode(5)));
        lists[1] = new ListNode(1, new ListNode(3, new ListNode(4)));
        lists[2] = new ListNode(2, new ListNode(6));

        Solution solution = new Solution();
        ListNode res = solution.mergeKLists(lists);
        System.out.println(res);
    }
}

