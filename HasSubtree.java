public class HasSubtree {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(8);
        TreeNode t2 = new TreeNode(8);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(9);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);

        TreeNode tt8 = new TreeNode(8);
        TreeNode tt9 = new TreeNode(9);
        TreeNode tt10 = new TreeNode(2);

        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.left = t6;
        t5.right = t7;

        tt8.left = tt9;
        tt8.right = tt10;
        System.out.println(new HasSubtree().HasSubtree(t1, tt8));

    }

    boolean flag = false;

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null || root1 == null) {
            return false;
        }
        search(root1, root2);
        return flag;
    }

    public boolean judge(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null && root2 != null) return false;
        boolean b1, b2;
        if (root1.val == root2.val) {
            b1 = judge(root1.left, root2.left);
            b2 = judge(root1.right, root2.right);
        } else {
            return false;
        }
        return b1 && b2;

    }
    public void search(TreeNode root1, TreeNode root2) {
        if (flag == true) {
            return;
        }
        if (root1 == null) return;
        if (root1.val == root2.val) {
            if (judge(root1, root2)) {
                flag = true;
            }
        }
        search(root1.left, root2);
        search(root1.right, root2);
    }
}

