# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def trav(self, root, pval, target, ret):
        if not root:
            return
        
        if not root.left and not root.right:
            if root.val + pval == target:
                ret[0] = True
            
        self.trav(root.left, root.val + pval, target, ret)
        self.trav(root.right, root.val + pval, target, ret)

    def hasPathSum(self, root, targetSum):
        ret = [False]
        self.trav(root, 0, targetSum, ret)
        return ret[0]
