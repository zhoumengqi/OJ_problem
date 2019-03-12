import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//此题没做。
public class clone_graph {
    class UndirectedGraphNode {
        int label;
        ArrayList<UndirectedGraphNode> neighbors;

        UndirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<UndirectedGraphNode>();
        }
    }

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;//空值
        if (node.neighbors == null || node.neighbors.size() == 0) {
            //只有一个节点，没有邻居的图
            return new UndirectedGraphNode(node.label);
        }

        UndirectedGraphNode result = new UndirectedGraphNode(node.label);
        LinkedList<UndirectedGraphNode> queue = new LinkedList<>();
        queue.add(node);
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        map.put(node, result);
        while (!queue.isEmpty()) {
            UndirectedGraphNode snode = queue.poll();
            UndirectedGraphNode snode_clone = queue.poll();

            ArrayList<UndirectedGraphNode> tmp_list = snode.neighbors;
            for (int i = 0; i < tmp_list.size(); i++) {
                UndirectedGraphNode ug = tmp_list.get(i);//得到邻接点
                if (map.containsKey(ug)) {
                    snode_clone.neighbors.add(map.get(ug));
                } else {
                    UndirectedGraphNode uu = new UndirectedGraphNode(ug.label);
                    map.put(ug, uu);
                    uu.neighbors.add(uu);
                    queue.push(ug);


                }

            }


        }


        return result;
    }

}
