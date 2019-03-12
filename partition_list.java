public class partition_list {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;
        ListNode pre, cur;
        ListNode fakeNode = new ListNode(-1);

        fakeNode.next = head;
        pre =cur= fakeNode;

        while (cur.next != null) {
            if (cur.next.val < x) {
                if(cur==pre){
                    cur=cur.next;
                    pre=pre.next;
                    continue;
                }
                ListNode exchangeNode = cur.next;
                cur.next = exchangeNode.next;
                exchangeNode.next = pre.next;
                pre.next = exchangeNode;
                pre = exchangeNode;

            } else {
                cur = cur.next;
            }
        }
//        head=fakeNode.next;
//        while (head!=null){
//            System.out.print(head.val+" ");
//            head=head.next;
//        }

        return fakeNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(2);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;



        new partition_list().partition(l1, 3);
    }
}
