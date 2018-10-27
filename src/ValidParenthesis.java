import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParenthesis {
    /*
    public static boolean vp(String str) {
        int len = str.length();
        if (len == 0) return true;
        Set<Character> fore = new HashSet<Character>(Arrays.asList('{', '(', '['));
        Set<Character> after = new HashSet<Character>(Arrays.asList('}', ']', ')'));
        
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < len; i++) {
            if (fore.contains(str.charAt(i))) stack.push(str.charAt(i));
            else if (after.contains(str.charAt(i))) {
                if (stack.isEmpty()) return false;
                char test = stack.pop();
                if (str.charAt(i) == '}' && test != '{') return false;
                if (str.charAt(i) == ']' && test != '[') return false;
                if (str.charAt(i) == ')' && test != '(') return false;
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
    */
    
    public static boolean vp(String str) {
        Stack<Character> stack = new Stack<Character>();
        int len = str.length();
        if (len == 0) return true;
        for (int i = 0; i < len; i++) {
            char test = str.charAt(i);
            if (test == '{' || test == '[' || test == '(') stack.push(test);
            else if (!stack.isEmpty() && test == '}' && stack.peek() == '{')  stack.pop();
            else if (!stack.isEmpty() && test == ']' && stack.peek() == '[')  stack.pop();
            else if (!stack.isEmpty() && test == ')' && stack.peek() == '(')  stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String test = "()[]{}";
        System.out.println(vp(test));
    }
}
