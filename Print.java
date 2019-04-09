import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) return res;
        Queue<TreeNode> q = new LinkedList();
        q.add(pRoot);
        int flag = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> tmp = new ArrayList();
            while (size-- > 0) {
                TreeNode cur = q.poll();
                if (flag == 1) {
                    tmp.add(cur.val);
                } else {
                    tmp.add(0, cur.val);
                }
                if (cur.right != null) ((LinkedList<TreeNode>) q).add(cur.right);
                if (cur.left != null) ((LinkedList<TreeNode>) q).add(cur.left);

            }
            res.add(tmp);
            if (flag == 0) {
                flag = 1;
            } else {
                flag = 0;
            }


        }
        return res;
    }

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        ArrayList<ArrayList<Integer>> res = new Print().Print(t1);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get((i)).get(j));
            }
        }

    }

}
