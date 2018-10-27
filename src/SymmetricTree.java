/**
 *  Leetcode problem #101.
 *  Check whether the tree is symmetric. 
 * @author andres
 * @date 7/21/2018
 *
 */
public class SymmetricTree {
    
    private class TreeNode {
        private TreeNode right;
        private TreeNode left;
        private int value;
        
        public TreeNode(int x) {
            this.value = x;
        }
    }
    
    public boolean symmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    // return true when a and b is mirror 
    private boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return (a.value == b.value) && isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
    
    public static void main(String[] args) {
        
    }
}
