package Q100SameTree;

import DataStructureUtils.TreeNode;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else {
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1,new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1,new TreeNode(2), new TreeNode(3));
        TreeNode r = new TreeNode(1,new TreeNode(2), new TreeNode(4));
        TreeNode w = new TreeNode(1);

        Solution solution = new Solution();
        System.out.println(solution.isSameTree(p,q));
        System.out.println(solution.isSameTree(p,r));
        System.out.println(solution.isSameTree(p,w));
    }
}
