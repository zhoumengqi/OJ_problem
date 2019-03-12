package 虚拟赛115;

import java.util.LinkedList;
import java.util.Queue;

public class two {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isCompleteTree(TreeNode root) {
        if (root.left == null && root.right == null) return true;

        Queue<TreeNode> q = new LinkedList();
        ((LinkedList) q).add(root);
        while (!q.isEmpty()) {
            TreeNode tmpNode = q.poll();
            if (tmpNode!= null) {
                ((LinkedList<TreeNode>) q).add(tmpNode.left);
                ((LinkedList<TreeNode>) q).add(tmpNode.right);
            } else {
                while (!q.isEmpty()) {
                    tmpNode = q.poll();
                    if (tmpNode != null) return false;

                }


            }


        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        System.out.println(new two().isCompleteTree(t1));
    }
}
