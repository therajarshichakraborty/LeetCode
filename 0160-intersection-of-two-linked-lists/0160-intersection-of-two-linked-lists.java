/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      /* 
        T.C = O(n)
        S.C = O(1)
      */
        ListNode a = headA;
        ListNode b = headB;

        while(a != b){
          a = (a!= null)? a.next: headB;
          b = (b!= null)? b.next : headA;
        }

        return a;
    }
}