class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}

public class KthNode {
    int index = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        //中序遍历
        if (pRoot != null) {
            TreeNode left = KthNode(pRoot.left, k);
            if (left != null) return left;
            index++;
            if (k == index) return pRoot;
            TreeNode right = KthNode(pRoot.right, k);
            if (right != null) return right;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(2);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        System.out.println(new KthNode().KthNode(t1,3).val);
    }

}
