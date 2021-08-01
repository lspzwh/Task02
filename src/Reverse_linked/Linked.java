package Reverse_linked;

public class Linked {
    public ListNode reverse(ListNode head){
        ListNode pre,next,cur;
        pre=null;
        cur=head;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}