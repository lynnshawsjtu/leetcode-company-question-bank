/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode p=dummy;
        while(p!=null&&p.next!=null){
            while(p!=null&&p.next!=null&&p.next.val==val){
                ListNode q=p.next;
                p.next=q.next;
            }
            p=p.next;
        }
        return dummy.next;
    }
}
