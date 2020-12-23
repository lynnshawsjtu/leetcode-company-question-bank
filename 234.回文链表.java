/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null) return true;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null&&fast.next.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        //快慢指针找到链表中点
        slow=reverse(slow.next);
        while(slow!=null){
            if(head.val!=slow.val)return false;
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
    //翻转链表
    private ListNode reverse(ListNode head){
        if(head.next==null) return head;
        ListNode newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }
}
