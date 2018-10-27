/**
 * Leetcode problem #121 easy: Best Time To Buy And Sell Stock.
 * 
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * Note that you cannot sell a stock before you buy one.
 * 
 * @author andres
 * @date 10/10/2018
 * 
 */
public class BestTimeToBuyAndSellStock {
    
    /*
    // brute force, time O(n^2), space O(1)
    public int profit(int[] input) {
        int len = input.length;
        int maxProfit = 0;
        for (int i = 0; i < len; i++) {
            int maxDiff = 0;
            for (int j = i + 1; j < len; j++) {
                maxDiff = Math.max(maxDiff, input[j] - input[i]);
            }
            maxProfit = Math.max(maxProfit, maxDiff);
        }
        return maxProfit;
    }
    */
    
    // time O(n), space O(1)
    public int profit(int[] input) {
        int len = input.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < len; i++) {
            if (input[i] < minPrice) {
                minPrice = input[i];
            } else if (input[i] - minPrice > maxProfit) {
                maxProfit = input[i] - minPrice;
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bt = new BestTimeToBuyAndSellStock();
        int[] input =  {7, 1, 5, 3, 6, 4};
        int[] input2 = {7, 6, 5, 4};
        System.out.println(bt.profit(input));
        System.out.println(bt.profit(input2));        
    }
}
