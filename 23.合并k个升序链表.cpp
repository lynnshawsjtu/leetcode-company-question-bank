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
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        //递归调用合并2个链表的函数
        if(lists.size()==0) return NULL;
        if(lists.size()==1) return lists[0];
        if(lists.size()==2) return mergeTwoLists(lists[0],lists[1]);
        int mid=lists.size()/2;
        vector<ListNode*> l1(mid,NULL);
        for(int i=0;i<mid;++i){
            l1[i]=lists[i];
        }
        vector<ListNode*> l2(lists.size()-mid,NULL);
        for(int i=mid;i<lists.size();++i){
            l2[i-mid]=lists[i];
        }
        return mergeTwoLists(mergeKLists(l1),mergeKLists(l2));
    }
    ListNode *mergeTwoLists(ListNode *l1,ListNode *l2){
        if(!l1) return l2;
        if(!l2) return l1;
        ListNode *head;
        if(l1->val<=l2->val){
            head=l1;
            head->next=mergeTwoLists(l1->next,l2);
        }
        else{
            head=l2;
            head->next=mergeTwoLists(l1,l2->next);
        }
        return head;
    }
};
