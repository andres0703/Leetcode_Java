/**
 * 
 * @author andres
 *
 */
public class AddTwoNums {
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        
        public String toString() {
        	StringBuilder str = new StringBuilder();
        	ListNode curr = this;
        	while (curr != null) {
        	    str.append(curr.val);
        	    curr = curr.next;
        	}
        	return str.reverse().toString();
        }
    }
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        
        while (l1 != null || l2 != null) {
        	int l1val = (l1 == null)? 0 : l1.val;
        	int l2val = (l2 == null)? 0 : l2.val;
        	int currDigit = l1val + l2val + carry;
        	carry = currDigit / 10;
        	currDigit = currDigit % 10;
        	curr.next = new ListNode(currDigit);
        	curr = curr.next;
        	
        	if (l1 != null) l1 = l1.next;
        	if (l2 != null) l2 = l2.next;
        }
        
        if (carry != 0) curr.next = new ListNode(1);
        return head.next;
    }
    
    public static void main(String[] args) {
    	ListNode a = new ListNode(1);
    	//ListNode b = new ListNode(3);
    	//ListNode c = new ListNode(3);
    	
    	ListNode d = new ListNode(9);
    	ListNode e = new ListNode(9);
    	ListNode f = new ListNode(9);

        //a.next = b;
        //b.next = c;
        d.next = e;
        e.next = f;
        
        System.out.println(addTwoNumbers(a, d));
    }
}
