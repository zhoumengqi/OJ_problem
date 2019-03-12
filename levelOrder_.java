import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelOrder_ {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> resList = new ArrayList<>();

        if (root == null) return resList;
        q.add(root);
        int cur = 0;
        while (0< q.size()) {
            int size = q.size();
            cur = 0;
            ArrayList<Integer> list = new ArrayList<>();
            while (cur < size) {
                TreeNode tmp = q.poll();
                list.add(tmp.val);

                if (tmp.left != null) {
                    ((LinkedList<TreeNode>) q).add(tmp.left);
                }
                if (tmp.right != null) {
                    ((LinkedList<TreeNode>) q).add(tmp.right);
                }
                cur++;
            }

            resList.add(list);
            for (Integer i : list
            ) {
                System.out.print(i + " ");

            }
            System.out.println();


        }

        return resList;
    }

    public static void main(String[] args) {

        TreeNode t = new  TreeNode(3);
        TreeNode t1 = new TreeNode(9);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(7);
        t.left = t1;
        t.right = t2;
        t2.left = t3;
        t2.right = t4;
        new levelOrder_().levelOrder(t);
    }
}
