/**
 * LeetCode No.21
 * Merge Two Sorted Lists.
 * @author andres
 * @date 07/28/2018
 */
public class mergeTwoLists {
    
    public static ListNode mtl(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode head;
        if (l1.val <= l2.val) {
            head = l1;
            head.next = mtl(l1.next, l2);
        } else {
            head = l2;
            head.next = mtl(l1, l2.next);
        }
        return head;
    }
    
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x)  { val = x; }
        
        public String toString() {
            StringBuilder str = new StringBuilder();
            str.append(this.val);
            ListNode ln = this;
            while (ln.next != null) {
                ln = ln.next;
                str.append(" -> " + ln.val);
            }
            return str.toString();
        }
    }
    
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(1);
        ListNode e = new ListNode(2);
        ListNode f = new ListNode(5);
        
        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;
        
        System.out.println(a);
        System.out.println(d);
        System.out.println(mtl(a, b));
    }
}
