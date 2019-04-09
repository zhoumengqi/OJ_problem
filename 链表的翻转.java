public class 链表的翻转 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode res=new 链表的翻转().reverse(l1);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }

    public ListNode reverse(ListNode l1) {
        if(l1==null||l1.next==null){
            return l1;
        }
        ListNode newNode=reverse(l1.next);
        l1.next.next=l1;
        l1.next=null;
        return newNode;
    }
}
