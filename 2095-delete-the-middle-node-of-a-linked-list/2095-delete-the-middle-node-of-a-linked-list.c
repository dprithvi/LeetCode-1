/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteMiddle(struct ListNode* head){
  struct ListNode* fast = head;
    struct ListNode* slow = head;
    struct ListNode* prev = NULL;
    
    while(fast != NULL && fast->next != NULL){
        prev = slow;
        fast = fast->next->next;
        slow = slow->next;
    }
    
    if(prev == NULL){
        return NULL;
    }
    
    prev->next = prev->next->next;
    return head;
}

