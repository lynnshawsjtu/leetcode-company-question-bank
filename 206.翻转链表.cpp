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
    ListNode* reverseList(ListNode* head) {
        if(!head) return NULL;
        if(!head->next) return head;//不要漏
        ListNode *next=reverseList(head->next);
        head->next->next=head;
        head->next=NULL;
      
        return next;
    }
};
