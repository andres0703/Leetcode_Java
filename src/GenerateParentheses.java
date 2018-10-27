import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode No.22 (medium): generate parentheses
 * 
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * For example, given n = 3, a solution set is:
 * [
 *  "((()))",
 *  "(()())",
 *  "(())()",
 *  "()(())",
 *  "()()()"
 * ]
 * 
 * @author andres
 * @date 10/27/2018
 *
 */
public class GenerateParentheses {
    
	// recursive backtracking method
    public List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<String>();
    	backtrack(result, "", n, 0, 0);
        return result;
    }
    
    private void backtrack(List<String> res, String cur, int max, int open, int close) {
    	if (cur.length() == 2 * max) {
    		res.add(cur);
    		return;
    	}
    	
    	if (open < max) {
    		backtrack(res, cur + "(", max, open + 1, close);
    	}
    	if (close < open) {
    	    backtrack(res, cur + ")", max, open, close + 1);
    	}
    }
    
    public static void main(String[] args) {
    	GenerateParentheses gp = new GenerateParentheses();
    	System.out.println(gp.generateParentheses(5));
    }
}
