public class reverseBetween {
  static  class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
   }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode m_pre=dummy;
        ListNode p;
        ListNode r = null;
        ListNode m_pos;
        int len=1;
        //找到m的位置
        while(len<m){
            m_pre=m_pre.next;
            len++;
        }
        //翻转
        p=m_pre.next;
        m_pos=m_pre.next;
        while(len<=n){
            r=p.next;
            p.next=m_pre.next;
            m_pre.next=p;
            p=r;
            if(r!=null)
                r=r.next;
            len++;
        }
//        System.out.println("r:"+r.val);
        m_pos.next=p;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode t =  new  ListNode(1);
        ListNode t1 = new ListNode(2);
        ListNode t2 = new ListNode(3);
        ListNode t3 = new ListNode(4);
        ListNode t4 = new ListNode(5);
        t.next = t1;
        t1.next = t2;
        t2.next = t3;
        t3.next = t4;
        ListNode head=new reverseBetween().reverseBetween(t,1,5);
        while(head!=null){
            System.out.print(head.val);
            head=head.next;
        }
    }
}
