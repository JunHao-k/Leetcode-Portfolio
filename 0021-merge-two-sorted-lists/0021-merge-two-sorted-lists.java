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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> sorted = new ArrayList<Integer>(); 
        ListNode sortedLL = null;
        ListNode sortedCurrent = null;
        ListNode current1 = list1;
        ListNode current2 = list2;
        
        while(current1 != null){
            sorted.add(current1.val);
            current1 = current1.next;
        }

        while(current2 != null){
            sorted.add(current2.val);
            current2 = current2.next;
        }

        Collections.sort(sorted);

        for(int i = 0; i < sorted.size(); i++){
            if(sortedLL == null){
                sortedLL = new ListNode(sorted.get(i));
                sortedCurrent = sortedLL;
            }
            else{
                sortedCurrent.next = new ListNode(sorted.get(i));
                sortedCurrent = sortedCurrent.next;
            }
        }
        return sortedLL;
    }
}