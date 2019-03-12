public class hasCycle {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode p = head;
        ListNode q = head;
        while (q.next != null && q.next.next != null) {

            q = q.next.next;//每次走两步
            p = p.next;//每次走一步
            if (p == q) return true;
            //走的慢的总会赶上快的，所以如果有环，一定会赶上

        }
        return false;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = null;
        System.out.println(new hasCycle().hasCycle(l1));
    }
}
