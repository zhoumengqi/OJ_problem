class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class EntryNodeOfLoop {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode slow = pHead;
        ListNode fast = pHead.next;
        while (slow != null && fast != null && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l1;
        ListNode res=new EntryNodeOfLoop().EntryNodeOfLoop(l1);
        System.out.println(res.val);
    }
}

