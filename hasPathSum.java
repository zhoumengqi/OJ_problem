public class hasPathSum {
    private boolean flag;
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        flag = false;
        fun(root, 0, sum);
        if (flag)
            return true;
        else
            return false;
    }
    private void fun(TreeNode root, int cur, int sum) {
        if (root == null) return;
        if (flag) return;
        if (root.left == null && root.right == null) {
            //是空节点
            if (cur + root.val == sum)
                flag = true;


        } else {
            fun(root.left, cur + root.val, sum);
            fun(root.right, cur + root.val, sum);


        }


    }

    public static void main(String[] args) {

    }

}
