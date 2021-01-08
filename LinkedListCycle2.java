142. Linked List Cycle II -- https://leetcode.com/problems/linked-list-cycle-ii/


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
 // Floyds algorithm. 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        boolean hasCycle =false;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        while(slowPointer != null && fastPointer != null && fastPointer.next !=null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if(slowPointer == fastPointer) {
                hasCycle = true;
                break;// break loop when cycle detected
            }
        }

        if(hasCycle) {
        // if cycle exists then start from start to find the position where cycle start. 
            while(head!=slowPointer)
            {
                head = head.next;
                slowPointer = slowPointer.next;
            }
            return head;
        }
        return null;
    }
}
