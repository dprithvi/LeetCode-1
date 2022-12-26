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
    public boolean isPalindrome(ListNode head) {
    ListNode curr = head;
        ListNode prev = head;
        while(curr!=null && curr.next!=null)
        {
            curr=curr.next.next;
            prev = prev.next;
        }
        ListNode dummy = null;
        while(prev!=null)
        {
            ListNode line = prev.next;
            prev.next = dummy;
            dummy = prev;
            prev = line;
        }
        while(head !=null&& dummy!=null)
        {
            if(head.val!=dummy.val)
                return false;
            head=head.next;
            dummy = dummy.next;
        }
        return true;
        
        
        
    }
}