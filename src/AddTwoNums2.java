public class AddTwoNums2 {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int carry = 0;
        
        while (l1 != null || l2 != null) {
            int currDigit;
            if (l1 == null) l1.val = 0;
            if (l2 == null) l2.val = 0;
            currDigit = l1.val + l2.val + carry;
            carry = currDigit / 10;
            currDigit = currDigit % 10;
            if (l1.next != null) l1 = l1.next;
            if (l2.next != null) l2 = l2.next;
            curr.next = new ListNode(currDigit);
            curr = curr.next;
        }
        
        if (carry != 0) { curr.next = new ListNode(1); }
        return head.next;
    }
    
    public static void main(String[] args) {
    	
    }
}