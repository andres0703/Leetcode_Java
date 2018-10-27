import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Leetcode problem medium #17: Letter Combinations of a Phone Number
 * Given a string containing digits from 2-9 inclusive, 
 * return all possible letter combinations that the number could represent.
 * 
 * @author andres
 * @date 9/5/2018
 */
public class LetterCombination {

    public List<String> solution(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits == null || digits.length() == 0) 
            return res;
        
        int index = 0;
        Map<Character, String> dict = constructMap();
        StringBuilder sb = new StringBuilder();
        dfs(digits, dict, index, sb, res);
        return res;
    }
    
    private void dfs(String digits, Map<Character, String> dict, int index, StringBuilder sb, List<String> res) {
        // base case
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String str = dict.get(digits.charAt(index));
        for (char c : str.toCharArray()) {
            sb.append(c);
            dfs(digits, dict, index + 1, sb, res);
            // recover
            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
    private Map<Character, String> constructMap() {
        Map<Character, String> map = new HashMap<Character, String>();
        map.put('0', " ");
        map.put('1', " ");
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }
    
    public static void main(String[] args) {
        String digits = "234";
        LetterCombination lb = new LetterCombination();
        System.out.println(lb.solution(digits));
    }
}
