public class isSymmetric {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return judge(root.left, root.right);
    }

    private boolean judge(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left != null && right != null) {
            if (left.val == right.val) {
                return (judge(left.left, right.right) && judge(left.right, right.left));

            }


        } else return false;

        return false;
    }

    public static void main(String[] args) {

    }
}
