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
    private void trav(TreeNode root, int pval, int target, boolean[] ret){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            if(pval + root.val == target){
                ret[0] = true;
            }
        }
        trav(root.left, pval + root.val, target, ret);
        trav(root.right, pval + root.val, target, ret);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean[] ret = {false};
        trav(root, 0, targetSum, ret);
        return(ret[0]);
    }
}
