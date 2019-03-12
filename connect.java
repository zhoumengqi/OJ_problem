import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class connect {
    public static class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    public void connect(TreeLinkNode root) {
        if(root == null)
            return;
        TreeLinkNode dummy = new TreeLinkNode(-1);
        TreeLinkNode cur;
        TreeLinkNode prev = dummy;
        for(cur=root; cur !=null; cur = cur.next){
            if(cur.left !=null)
            {
                prev.next = cur.left;
                prev = prev.next;
            }
            if(cur.right !=null){
                prev.next = cur.right;
                prev = prev.next;
            }
        }
        connect(dummy.next);
    }


    public static void main(String[] args) {

        TreeLinkNode t = new TreeLinkNode(1);
        TreeLinkNode t1 = new TreeLinkNode(2);
        TreeLinkNode t2 = new TreeLinkNode(3);
        TreeLinkNode t3 = new TreeLinkNode(4);
        TreeLinkNode t4 = new TreeLinkNode(5);
        t.left = t1;
        t.right = t2;
        t2.left = t3;
        t2.right = t4;
        new connect().connect(t);
    }
}
