import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *  Leetcode #406. Queue Reconstruction by Height.
 *  Suppose you have a random list of people standing in a queue. Each person is described 
 *  by a pair of integers (h, k), where h is the height of the person and k is the number of people 
 *  in front of this person who have a height greater than or equal to h. 
 *  Write an algorithm to reconstruct the queue.
 *  Time Analysis: O(nlogn)
 * @author andres
 * @date 9/1/2018
 *
 */
public class ReconstructQueue {

    public static int[][] reconstructQueue(int[][] queue) {
        
        Arrays.sort(queue, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) return b[0] - a[0];
                else return a[1] - b[1];
            }
        });
        
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < queue.length; i++) {
            list.add(queue[i][1], queue[i]);
        }
        return list.toArray(new int[queue.length][]);
    }
    
    public static void main(String[] args) {
        int[][] queue = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] a = reconstructQueue(queue);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }
}
