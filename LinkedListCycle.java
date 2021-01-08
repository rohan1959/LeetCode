141. Linked List Cycle - https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 
 // Floyds algorithm using 2 pointer approach, fast and slow pointer. 
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slowPointer = head;
        
        ListNode fastPointer = head;
        
        while(slowPointer != null && fastPointer !=null && fastPointer.next !=null) {
            
             slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if( slowPointer  == fastPointer) {
                return true;
            }
           
        }
        return false;
    }
}
