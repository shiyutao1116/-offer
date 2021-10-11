/**
 * @author shiyutao
 * @create 2021-10-08 20:56
 */
public class T4 {
    public ListNode reverseList(ListNode head) {
        ListNode end=null;
        ListNode pre=head;
        while (pre!=null){
            head=head.next;
            pre.next=end;
            end=pre;
            pre=head;
        }


        return end;
    }


}

class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
 }
