//LC 83. Remove Duplicates from Sorted List

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
 
 // 2 pointer approach to filter out duplicates as linked list is sorted skip next node if values are same. 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode ptr1 = head;
        
        while(ptr1!=null && ptr1.next !=null) {
            
            if(ptr1.val == ptr1.next.val) {
                ptr1.next=ptr1.next.next;
            }
            else  {
                ptr1 = ptr1.next;
            }
        } 
        return head;
    }
}
