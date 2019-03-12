public class swapPairs {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode pre,p,q;
        p=head;
        q=head.next;
        head=q;
        p.next=q.next;
        q.next=p;
        pre=p;
        while (pre.next!=null&&pre.next.next!=null){
            p=pre.next;
            q=p.next;
            pre.next=q;
            p.next=q.next;
            q.next=p;
            pre=p;
        }
        return  head;
    }

    public static void main(String[] args) {

    }

}
