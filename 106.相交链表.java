/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p=headA;
        ListNode q=headB;
        int lenA=0;
        int lenB=0;
        while(p!=null){
            lenA++;
            p=p.next;
        }
        while(q!=null){
            lenB++;
            q=q.next;
        }
        if(lenA<lenB){
            ListNode tmp=headA;
            headA=headB;
            headB=tmp;
        }
        p=headA;
        q=headB;
        for(int i=1;i<=Math.abs(lenA-lenB);++i){
            p=p.next;
        }
        while(p!=null&&q!=null){
            if(p==q) return p;
            p=p.next;
            q=q.next;

        }
        return null;
    }
}
