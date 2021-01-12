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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode p=head;
        ListNode q=p.next;
        while(p!=null&&q!=null){
            while(p!=null&&q!=null&&p.val==q.val){
                p.next=q.next;
                q=p.next;
            }
            p=p.next;
            if(p==null) break;
            q=p.next;
        }
        return dummy.next;
    }
}
