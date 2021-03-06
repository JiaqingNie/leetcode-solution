package DataStructureUtils;

public class ListNode {
      public int val;
      public ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      @Override
      public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(val);
            ListNode p = next;
            while (p != null) {
                  sb.append(", " + p.val);
                  p = p.next;
            }
            return sb.toString();
      }
}
