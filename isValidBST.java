public class isValidBST {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    TreeNode pre;
    public boolean isValidBST(TreeNode root) {
        pre=new TreeNode(-99999);
        return judge(root);
    }
    public boolean judge(TreeNode root){
        if(root==null) return true;
        boolean flag_left=judge(root.left);
        if(pre.val<root.val){
            pre=root;
        }else{
            return false;
        }

        boolean flag_right=judge(root.right);
        return flag_left&&flag_right;
    }

    public static void main(String[] args) {
        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(1);
         t1.left=t2;
        System.out.println(new isValidBST().isValidBST(t1));
    }
}
