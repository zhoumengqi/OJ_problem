class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Clone {

    public RandomListNode Clone(RandomListNode pHead) {
        RandomListNode dummy = new RandomListNode(-1);
        dummy.next = pHead;
        RandomListNode p = pHead;//工作指针
        //复制链表，并插入到每个原节点的后面
        while (p != null) {
            RandomListNode tmp = new RandomListNode(p.label);
            tmp.next = p.next;
            p.next = tmp;
            p = p.next.next;
        }
        //修改每个复制后节点的random指针
        p = pHead;
        while (p != null) {
            if (p.random != null)
                p.next.random = p.random.next;//
            p = p.next.next;
        }
        //分离链表
        RandomListNode q = dummy;
        p = pHead;
        while (p != null) {
            q.next = p.next;
            p = p.next.next;
            q = q.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RandomListNode r1 = new RandomListNode(1);
        RandomListNode r2 = new RandomListNode(2);
        RandomListNode r3 = new RandomListNode(3);
        RandomListNode r4 = new RandomListNode(4);
        r1.next = r2;
        r2.next = r3;
        r3.next = r4;
        r1.random = r4;
        r2.random = r4;
//        r3.random = r4;
        RandomListNode res =new Clone().Clone(r1);
        while(res!=null){
            System.out.println(res.label);
            res=res.next;
        }
    }
}
