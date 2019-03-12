package Leetcodeweekly_110;

public class RangeSumBST {


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        sum=0;
        search(root, L, R);
        return sum;
    }

    private void search(TreeNode root, int l, int r) {
        if (root == null) return;
        if (root.val >= l && root.val <= r) {
            sum += root.val;
        }
        search(root.left, l, r);
        search(root.right, l, r);



    }
}
