/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p=head;
        ListNode q=head;
        int count=0;
        while(count<k){
            p=p.next;
            count++;
        }
        while(p!=null){
            p=p.next;
            q=q.next;
        }

        return q;
    }
}
