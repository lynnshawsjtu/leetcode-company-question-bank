/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode p=dummy;
        ListNode left,right;
        //三指针
        while(p.next!=null){
            left=p.next;
            right=left;
            while(right.next!=null&&right.next.val==left.val) 
            right=right.next;
            if(left==right) p=p.next;
            else if(right.next!=null)p.next=right.next;
            else p.next=null;
        }
        return dummy.next;
       
    }
}
