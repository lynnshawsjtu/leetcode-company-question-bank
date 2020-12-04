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
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode dummy=new ListNode(-1);
        ListNode p=dummy;
        int t=0;
        while(l1!=null&&l2!=null){
            int num=t+l1.val+l2.val;
            t=num/10;
            num=num%10;
            p.next=new ListNode(num);
            p=p.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int num=t+l1.val;
            t=num/10;
            num=num%10;
            p.next=new ListNode(num);
            p=p.next;
            l1=l1.next;
           
        }
        while(l2!=null){
            int num=t+l2.val;
            t=num/10;
            num=num%10;
            p.next=new ListNode(num);
            p=p.next;
            l2=l2.next;
        }
        if(t!=0){
            p.next=new ListNode(t);
            p=p.next;
        }
        return reverse(dummy.next);
    }
    private ListNode reverse(ListNode l){
        if(l==null||l.next==null) return l;
        ListNode r=reverse(l.next);
        ListNode p=l.next;
        p.next=l;
        l.next=null;
        return r;

    }
}
