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
    public ListNode sortList(ListNode head) {
        //与普通归并相比，链表的归并并不需要额外空间
        //用2个指针，fast-slow,一个每次走两步一个走一步，直到快的走到末尾然后慢的就是中间位置
        return head==null?null:mergeSort(head);
    }
    private ListNode mergeSort(ListNode head){
        if(head.next==null) return head;
        ListNode p=head,q=head,pre=null;
        while(q!=null&&q.next!=null){
            pre=p;
            p=p.next;
            q=q.next.next;
        }
        pre.next=null;
        ListNode l=mergeSort(head);
        ListNode r=mergeSort(p);
        return merge(l,r);
    }
    ListNode merge(ListNode l,ListNode r){
        ListNode dummyHead=new ListNode(0);
        ListNode cur=dummyHead;
        while(l!=null&&r!=null){
            if(l.val<=r.val){
                cur.next=l;
                cur=cur.next;
                l=l.next;
            }
            else{
                cur.next=r;
                cur=cur.next;
                r=r.next;
            }
        }
        if(l!=null) cur.next=l;
        if(r!=null) cur.next=r;
        return dummyHead.next;
    }
}
