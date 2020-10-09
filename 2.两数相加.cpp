/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        int t=0;//进位标志
        ListNode *head=new ListNode(-1);
        ListNode *p=l1;
        ListNode *q=l2;
        ListNode *r=head;
        while(p&&q)
        {
            ListNode *temp=new ListNode((p->val+q->val+t)%10);
            r->next=temp;
            r=r->next;
            t=(p->val+q->val+t)/10;
            p=p->next;
            q=q->next;
        }
        while(p)
        {
            ListNode *temp=new ListNode((p->val+t)%10);
            r->next=temp;
            r=r->next;
            t=(p->val+t)/10;
            p=p->next;
        }
         while(q)
        {
            ListNode *temp=new ListNode((q->val+t)%10);
            r->next=temp;
            r=r->next;
            t=(q->val+t)/10;
            q=q->next;
        }
        if(t)
        {
            ListNode *temp=new ListNode(t);
            r->next=temp;
        }
        return head->next;
    }
};
