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

import java.util.*;
class Solution {
    public void reorderList(ListNode head) {
        Deque<ListNode> deque = new LinkedList<ListNode>();
        ListNode current = head;
        ListNode newCurrent;
        boolean isLast = false;
        while(current != null){
            deque.add(current);
            current = current.next;
        }
        if(deque.size() > 1){
            deque.pollFirst();
            newCurrent = deque.pollLast();
            head.next = newCurrent;
        
            while(deque.size() != 0){
                if(isLast){
                    newCurrent.next = deque.pollLast();
                    newCurrent = newCurrent.next;
                    isLast = false;
                }
                else{
                    newCurrent.next = deque.pollFirst();
                    newCurrent = newCurrent.next;
                    isLast = true;
                }  
            }
            newCurrent.next = null;
        }
        
        
    }
}