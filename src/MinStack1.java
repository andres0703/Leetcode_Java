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
public class MinStack1 {
    
    /*
     * Implemented with array.
     * Used a tricky way to handle the situation where min element is popped.
     * 
     */
    private int ptr;
    private int[] stack;
    private int min;

    public MinStack1() {
        ptr = -1;
        stack = new int[10000];
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if (x < min) {
            stack[++ptr] = min;
            min = x;
        }
        stack[++ptr] = x;
    }
    
    public void pop() {
        if (stack[ptr] == min) {
            min = stack[--ptr];
            ptr--;
        } else {
            ptr--;
        }
    }
    
    public int top() {
        return stack[ptr];
    }
    
    public int getMin() {
        return min;
    }    
    
    public static void main(String[] args) {
        
        MinStack1 stack = new MinStack1();
        stack.push(10);
        stack.push(9);
        stack.push(8);
        stack.push(80);
        stack.push(6);
        stack.top();
        stack.getMin();
        stack.pop();
        stack.pop();
        
        System.out.println(stack.top());
        System.out.println(stack.getMin());
    }
}
