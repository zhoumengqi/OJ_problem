import java.util.IdentityHashMap;

public class isSameTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q != null) {
            if (p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            } else {//值不等
                return false;
            }
        } else {
            //一个为空，一个不为空

            return false;
        }


    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t1.left = t2;
//        t1.right = t3;
        t2.left = t4;

        TreeNode t11 = new TreeNode(1);
        TreeNode t22 = new TreeNode(2);
        TreeNode t33 = new TreeNode(3);
        TreeNode t44 = new TreeNode(4);
        t11.left = t22;
//        t11.right = t33;
        t22.right = t44;


        System.out.println(new isSameTree().isSameTree(t1, t11));
    }

}
