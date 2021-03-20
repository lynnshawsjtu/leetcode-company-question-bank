/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int t=0;
        ListNode p=l1;
        ListNode q=l2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(p!=null&&q!=null){
            int sum=p.val+q.val+t;
            t=sum/10;
            sum=sum%10;
            temp.next=new ListNode(sum);
            temp=temp.next;
            p=p.next;
            q=q.next;
        }
        while(p!=null){
            int sum=p.val+t;
            t=sum/10;
            sum=sum%10;
            temp.next=new ListNode(sum);
            temp=temp.next;
            p=p.next;
            
        }
        while(q!=null){
            int sum=q.val+t;
            t=sum/10;
            sum=sum%10;
            temp.next=new ListNode(sum);
            temp=temp.next;
            q=q.next;
            
        }
        if(t>0) temp.next=new ListNode(t);
        return dummy.next;
    }
}
