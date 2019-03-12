public class construct_binary_tree_from_preorder_and_inorder_traversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        return generateBinary(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);


    }

    private TreeNode generateBinary(int[] preorder, int[] inorder, int prestat, int preend, int instat, int inend) {
        if (preend < prestat || inend <= instat) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[prestat]);
        int size = 0, i = instat;
        for (i = instat; i < inend; i++) {
            if (preorder[prestat] == inorder[i]) {
                size = i - instat;
                break;
            }
        }
        root.left = generateBinary(preorder, inorder, prestat + 1, prestat + size, instat, i - 1);
        root.right = generateBinary(preorder, inorder, prestat + 1+size, preend, i + 1, inend);
        return root;
    }
}
