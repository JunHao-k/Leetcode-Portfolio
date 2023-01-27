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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode current = head;
        ListNode temp;
        ListNode otherCurrent = head;
        int total = 0;
        int targetNum = 0;
        while(current != null){
            total += 1;
            current = current.next;
        }
        if(total == 1){
            return null;
        }
        else if(total == n){
            head = head.next;
            return head;
        }
        else{
            targetNum = total - n - 1;
        }
        
        while(otherCurrent != null){
            if(targetNum != 0){
                targetNum--;
                otherCurrent = otherCurrent.next;
            }
            else{
                break;
            }
        }
        temp = otherCurrent.next;
        otherCurrent.next = temp.next;
        return head;
    }
}