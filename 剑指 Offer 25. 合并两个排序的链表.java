/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode p=l1;
        ListNode q=l2;
        ListNode res=dummy;
        while(p!=null&&q!=null){
            if(p.val>=q.val){
                res.next=new ListNode(q.val);
                q=q.next;
            } else{
                res.next=new ListNode(p.val);
                p=p.next;
            }
            res=res.next;
        }
        if(p!=null) res.next=p;
        if(q!=null) res.next=q;
        return dummy.next;
    }
}
