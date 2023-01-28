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
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> nodeStack =  new Stack<ListNode>();
        ListNode current = head;
        StringBuilder normal = new StringBuilder();
        StringBuilder reverse = new StringBuilder();

        while(current != null){
            normal.append(current.val);
            current = current.next;
        }
        String normalStr = normal.toString();

        for(int i = normalStr.length() - 1; i >= 0; i--){
            reverse.append(normalStr.charAt(i));
        }
        String reverseStr = reverse.toString();
        System.out.println(reverseStr);

        return(normalStr.equals(reverseStr));
        
    }
}