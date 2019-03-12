public class maxDepth {
     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        return search(root);
    }

    private int search(TreeNode root) {
        if (root==null)return 0;
        return Math.max(search(root.left),search(root.right))+1;


    }

    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        t1.left=new TreeNode(2);
        t1.right=new TreeNode(3);
        System.out.println(new maxDepth().maxDepth(t1));
    }

}
