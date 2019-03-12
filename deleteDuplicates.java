import java.util.List;

public class deleteDuplicates {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode p = head;
        ListNode q = null;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
//                q=p.next;
//                p.next=q.next;
//                p=q.next;
                p.next = p.next.next;

            } else {
                p = p.next;
            }


        }


        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(2);
        head.next.next = new ListNode(9);
        ListNode res = new deleteDuplicates().deleteDuplicates(head);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }

}
