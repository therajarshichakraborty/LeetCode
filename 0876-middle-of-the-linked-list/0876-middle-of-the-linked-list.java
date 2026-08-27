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
    public ListNode middleNode(ListNode head) {
        // int count = 0;
        // ListNode current = head;
        
        // while(current != null){
        //     count++;
        //     current = current.next;
        // }
        
        // int middleNode = (int)Math.floor(count/2.0);
        // current = head;
        
        // for(int i=0;i<middleNode;i++){
        //     current = current.next;            
        // }
        
        // return current;


        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;
        }

        return slow;
    }
}