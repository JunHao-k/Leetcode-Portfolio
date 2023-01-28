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
import java.util.*;
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode , Integer> nodeRecords = new HashMap<ListNode , Integer>();
        ListNode current = head;
        int pos = 0;
        while(current != null){
            if(nodeRecords.containsKey(current)){
                return true;
            }
            else{
                nodeRecords.put(current , pos);
                pos += 1;
                current = current.next;
            }
        }
        return false;
    }
}