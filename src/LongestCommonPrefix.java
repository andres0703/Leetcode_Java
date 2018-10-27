
public class LongestCommonPrefix {
    
    public static String lcp(String[] strs) {
        String res = "";
        if (strs == null) return res;
        int len = strs.length;
        int shortestLen = Integer.MAX_VALUE;
        
        // find out the shortest string length of the array
        for (int i = 0; i < len; i++) {
            if (strs[i].length() < shortestLen) {
                shortestLen = strs[i].length();
            }
        }
        
        //outerloop:
        for (int i = 0; i < shortestLen; i++) {
            for (int j = 0; j < len; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i))
                    return res;
            }
            res += strs[0].charAt(i);
        }
        return res;
    }
    
    public static void main(String[] args) {
        
        String a = "flower";
        String b = "flow";
        String c = "floooooht";
        String d = "floooffff";
        String[] strs = {a, b, c, d};
        System.out.println(lcp(strs));
        
    }
}
