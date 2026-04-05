import java.util.Collections;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> r=new ArrayList<>();
    public void t(TreeNode root){
        if(root==null) return;
        r.add(root.val);
        t(root.left);
        t(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
        t(root);
        Collections.sort(r);
        return r.get(k-1);
    }
}