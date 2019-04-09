import java.util.LinkedList;
import java.util.Queue;

public class 序列化和反序列化二叉树 {
    String Serialize(TreeNode root) {
        String res = "";
        if (root == null) return res;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            int cursize = q.size();
            while (cursize > 0) {
                TreeNode tmp = q.poll();
                if (tmp == null) {
                    res = res + "." + "#";
                } else {
                    res = res + "." + tmp.val;
                    q.add(tmp.left);
                    q.add(tmp.right);
                }
                cursize--;
            }
        }
        return res;
    }
    TreeNode Deserialize(String str) {
        String str_arr[]=str.split("\\.");
        if(str_arr.length==0) return  null;
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode root =new TreeNode(Integer.parseInt(str_arr[1]));
        ((LinkedList<TreeNode>) q).add(root);
        int index=1;
        while(!q.isEmpty()){
            int cursize = q.size();
            while(cursize>0){
                TreeNode tmp=q.poll();
                if(index<str_arr.length&&str_arr[index+1].equals("#")){
                    tmp.left=null;
                }else{
                    tmp.left=new TreeNode(Integer.parseInt(str_arr[index+1]));
                }
                index++;
                if(index<str_arr.length&&str_arr[index+1].equals("#")){
                    tmp.right=null;
                }else{
                    tmp.right=new TreeNode(Integer.parseInt(str_arr[1+index]));
                }
                index++;
                if(tmp.left!=null) q.add(tmp.left);
                if(tmp.right!=null) q.add(tmp.right);
                cursize--;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t1.left = t2;
        t2.right = t3;
        t2.left = t4;
        String res=(new 序列化和反序列化二叉树().Serialize(t1));
        System.out.println(res);
        TreeNode root=new 序列化和反序列化二叉树().Deserialize(res);
        print(root);

    }
    public static void print(TreeNode root){
        if(root==null) return ;

        System.out.println(root.val);
        print(root.left);
        print(root.right);

    }

}
