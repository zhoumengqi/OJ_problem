package test;

import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Main {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return fun(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    public TreeNode fun(int pre[], int prestart, int preend, int in[], int instart, int inend) {
        if (prestart > preend) return null;
        TreeNode tmproot = new TreeNode(pre[prestart]);
        int index = 0;
        for (int i = instart; i <= inend; i++) {
            if (in[i] == pre[prestart]) {
                index = i;
                break;
            }
        }
        tmproot.left = fun(pre, prestart + 1, prestart + index - instart, in, instart, index - 1);
        tmproot.right = fun(pre, prestart + index - instart + 1, preend, in, index + 1, inend);
        return tmproot;
    }

    public static void main(String[] args) {
        int a[]={1,2,4,7,3,5,6,8};
        int b[]={4,7,2,1,5,3,8,6};
        TreeNode t=new Main().reConstructBinaryTree(a,b);
        print(t);
    }

    private static void print(TreeNode t) {
        if (t!=null){
            System.out.print(t.val+" ");;
            print(t.left);
            print(t.right);


        }
    }


}


