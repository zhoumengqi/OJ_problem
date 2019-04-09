package 华为机试;

public class MergeListNode {
     static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
     }
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode res=new ListNode(-1);
        while(list1!=null&&list2!=null){
            if(list2.val>list1.val){
                res.next=list1;
                list1=list1.next;
                res=res.next;
            }else{
                res.next=list2;
                list2=list2.next;
                res=res.next;
            }

        }
        while(list1!=null){
            res.next=list1;
            list1=list1.next;
            res=res.next;
        }
        while(list2!=null){
            res.next=list2;
            list2=list2.next;
            res=res.next;
        }

        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        new MergeListNode().Merge(l1,l2);
    }
}
