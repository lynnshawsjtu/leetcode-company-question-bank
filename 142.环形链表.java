/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode p=head;
        ListNode q=head;
        boolean flag=false;
        while(p!=null&&q!=null&&q.next!=null){
            p=p.next;
            q=q.next.next;
            if(p==q){
                flag=true;
                break;
            }
        }
        if(flag==false) return null;
        ListNode r=head;
        while(p!=r){
            p=p.next;
            r=r.next;
        }
        return r;
    }
}
