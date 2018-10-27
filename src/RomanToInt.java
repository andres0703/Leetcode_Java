/**
 * This program converse Roman number string into integer. 
 * @author andres
 * @date 07/27/2018
 */
public class RomanToInt {

    /*
    // This is the clumsy algorithm that I came up with. It works though.
    public static int converse(String str) {
        char[] ch = str.toCharArray();
        int len = ch.length;
        int res = 0;
        
        for (int i = 0; i < len; i++) {
            if (ch[i] == 'M') {
                res += 1000;
            } else if (ch[i] == 'D') {
                res += 500;
            } else if (ch[i] == 'C') {
                if (i == len - 1) res += 100;
                else if (ch[i + 1] == 'D') {
                    res += 400;
                    i++;
                } else if (ch[i + 1] == 'M') {
                    res += 900;
                    i++;
                } else res += 100;
            } else if (ch[i] == 'L') {
                res += 50;
            } else if (ch[i] == 'X') {
                if (i == len - 1) res += 10;
                else if (ch[i + 1] == 'L') {
                    res += 40;
                    i++;
                } else if (ch[i + 1] == 'C') {
                    res += 90;
                    i++;
                } else res += 10;
            } else if (ch[i] == 'V') {
                res += 5;
            } else if (ch[i] == 'I') {
                if (i == len - 1) res += 1;
                else if (ch[i + 1] == 'V') {
                    res += 4;
                    i++;
                } else if (ch[i + 1] == 'X') {
                    res += 9;
                    i++;
                } else res += 1;
            }
        }
        return res;
    }
    */
    
    // This is the elegant program from leetcode answer.
    public static int converse(String str) {
        int len = str.length();
        int[] values = new int[len];
        int res = 0;
        
        for (int i = 0; i < len; i++) {
            switch (str.charAt(i)) {
                case 'I': 
                    values[i] = 1;
                    break;
                case 'V': 
                    values[i] = 5;
                    break;
                case 'X': 
                    values[i] = 10;
                    break;
                case 'L': 
                    values[i] = 50;
                    break;
                case 'C': 
                    values[i] = 100;
                    break;
                case 'D': 
                    values[i] = 500;
                    break;
                case 'M': 
                    values[i] = 1000;
                    break;
            }
        }
        
        for (int i = 0; i < len - 1; i++) {
            if (values[i] >= values[i + 1])
                res += values[i];
            else if (values[i] < values[i + 1]) {
                res -= values[i];
            }
        }
        return res + values[len - 1];
    }
    
    public static void main(String[] args) {
        String a = "MCMXCIV";
        String b = "LVIII";
        String c = "IX";
        System.out.println(converse(a));
        System.out.println(converse(b));
        System.out.println(converse(c));
    }
}
