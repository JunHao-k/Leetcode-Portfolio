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
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode previous = head;
        if(head == null){
            return head;
        }
        else{
            while((current != null)){
                if(current == head){
                    if(current.val == val){
                        current = current.next;
                        previous = previous.next;
                        head = head.next;
                    }
                    else{
                        current = current.next;
                    }
                }
                else{
                    if(current.val == val){
                        current = current.next;
                        previous.next = current;
                    }
                    else{
                        current = current.next;
                        previous = previous.next;
                    }
                }
                
                
            }
        }
        return head;
    }
}