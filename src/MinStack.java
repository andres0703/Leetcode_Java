/**
 * Leetcode problem #155 easy: Min Stack.
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *   push(x) -- Push element x onto stack.
 *   pop() -- Removes the element on top of the stack.
 *   top() -- Get the top element.
 *   getMin() -- Retrieve the minimum element in the stack.
 * 
 * @author andres
 * @date 10/14/2018
 *
 */
public class MinStack {
    private Node head;
    
    private class Node {
        int x;
        int min;
        Node next;
        
        public Node(int x, int min, Node next) {
            this.x = x;
            this.min = min;
            this.next = next;
        }
    }

    public MinStack() {
        head = null;
    }
    
    public void push(int x) {
        if (head == null) {
            head = new Node(x, x, null);
        } else {
            Node node = new Node(x, Math.min(head.min, x), head);
            head = node;
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.x;
    }
    
    public int getMin() {
        return head.min;
    }
    
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.top());
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
    }
}
