public class Solution {
    private void trav(TreeNode root, int pval, int target, bool[] ret){
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

    public bool HasPathSum(TreeNode root, int targetSum) {
        bool[] ret = {false};
        trav(root, 0, targetSum, ret);
        return ret[0];
    }
}
