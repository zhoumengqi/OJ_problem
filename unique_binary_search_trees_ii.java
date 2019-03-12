import java.util.ArrayList;

public class unique_binary_search_trees_ii {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    public ArrayList<TreeNode> generateTrees(int n) {
        return build(1, n);
    }

    private ArrayList<TreeNode> build(int low, int high) {
        ArrayList<TreeNode> res = new ArrayList<>();
        if (low > high) {
            res.add(null);
            return res;
        }
        for (int i = low; i <= high; ++i) {
            ArrayList<TreeNode> left = build(low, i - 1);
            ArrayList<TreeNode> right = build(i + 1, high);
            for (int j = 0; j < left.size(); ++j) {
                for (int k = 0; k < right.size(); ++k) {
                    TreeNode root = new TreeNode(i);
                    root.left = left.get(j);
                    root.right = right.get(k);
                    res.add(root);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new unique_binary_search_trees_ii().generateTrees(4);
    }
}
