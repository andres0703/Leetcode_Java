/**
 * Leetcode No.19 (medium): Remove Nth Node From End of List
 * 
 * @author andres
 * @date 10/24/2018
 */
public class RemoveNthFromEnd {
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode current = this;
            while (current != null) {
                sb.append(current.val + " ");
                current = current.next;
            }
            return sb.toString();
        }
    }
    
    // time: O(n)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = countNodes(head);
        if (n > count || n <= 0) {
            throw new IndexOutOfBoundsException("index out of bound");
        } else if (count == n) {
            head = head.next;
            return head;
        }
        
        int index = count - n;
        ListNode current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        return head;
    }
    
    // count the number of nodes of a node list
    private int countNodes(ListNode head) {
        ListNode current = head;
        int count = 1;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }
}