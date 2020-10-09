/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode *dummy=new ListNode(-1);
        ListNode *p=dummy;
        while(l1&&l2){
            if(l1->val<l2->val){
                p->next=new ListNode(l1->val);
                l1=l1->next;
                p=p->next;
            }
            else {
                p->next=new ListNode(l2->val);
                l2=l2->next;
                p=p->next;
            }
        }
        while(l1){
            p->next=new ListNode(l1->val);
            l1=l1->next;
            p=p->next;
        }
        while(l2){
            p->next=new ListNode(l2->val);
            l2=l2->next;
            p=p->next;
        }
        return dummy->next;
    }
};
