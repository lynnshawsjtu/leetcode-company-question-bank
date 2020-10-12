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
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode *dummy=new ListNode(0);
        ListNode *prev=dummy,*curr=head,*next;
        dummy->next=head;
        int length=0;
        while(head){
            length++;
            head=head->next;
        }
        head=dummy->next;
        for(int i=0;i<length/k;++i){
            for(int j=0;j<k-1;++j){
                next=curr->next;
                curr->next=next->next;
                next->next=prev->next;
                prev->next=next;

            }
            prev=curr;
            curr=prev->next;
        }
        return dummy->next;
    }
};
