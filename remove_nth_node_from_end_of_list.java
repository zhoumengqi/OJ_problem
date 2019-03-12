public class remove_nth_node_from_end_of_list {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode fastNode=head,slowNode=head;
         if (head.next==null&&n==1) return null;
         int i=0;
         while (i<=n){
             if (fastNode==null){
              slowNode=head.next;
              return slowNode;

             }
             fastNode=fastNode.next;
             i++;
         }
         while (fastNode!=null){
            slowNode=slowNode.next;
            fastNode=fastNode.next;
         }
         slowNode.next=slowNode.next.next;
     return head;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        ListNode head1=new ListNode(2);
        ListNode head2=new ListNode(3);
        ListNode head3=new ListNode(4);
        ListNode head4=new ListNode(5);
        head.next=head1;
        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=null;
        new remove_nth_node_from_end_of_list().removeNthFromEnd(head,5);
        while (head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }

    }
}
