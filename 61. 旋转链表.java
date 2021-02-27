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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0) return head;
        int length=0;
        ListNode p=head;
        while(p!=null){
            length++;
            p=p.next;
        }
        p=head;
        int [] temp=new int[length];
        for(int i=0;i<length;++i){
            temp[i]=p.val;
            p=p.next;
        }
        ListNode head1=new ListNode(-1);
        p=head1;
        k=k%length;
        for(int i=0;i<length;++i){
            p.next=new ListNode(temp[(i+length-k)%length]);
            p=p.next;
        }
        return head1.next;
    }
}
