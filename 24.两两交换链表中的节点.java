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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode pre=dummy;
        while(pre.next!=null&&pre.next.next!=null){
            ListNode tmp1=pre.next;
            ListNode tmp2=pre.next.next;
            tmp1.next=tmp2.next;
            tmp2.next=tmp1;
            pre.next=tmp2;
            pre=tmp1;
            
        }
        return dummy.next;
    }
}
