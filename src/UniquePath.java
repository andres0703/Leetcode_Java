
import java.lang.IllegalArgumentException;

public class UniquePath {

    public static double uniquePath(int m, int n) {
        int right = m - 1, down = n - 1, sum = right + down;
         return combination(sum, right);
    }
    
    private static double combination(int n, int k) {
        if (n < k) throw new IllegalArgumentException("n must be bigger than k");
        double res = factorial(n) / (factorial(n - k) * factorial(k));
        return res;
    }
    
    private static double factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("can't be negative");
        if (n == 0) return 1;
        double res = 1;
        while (n > 0) {
            res *= n;
            n--;
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(uniquePath(30, 30));
    }
}
