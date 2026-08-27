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
public class Solution {
  public boolean hasCycle(ListNode head) {
    // init a hashset 
    // if the set contain the next pointer of the current node , 
    // then just sy "true"
    // else , put into the set

    if(head == null || head.next == null){
      return false;
    }

    // HashSet<ListNode> set = new HashSet<>();
    // ListNode temp = head;

    // while (temp != null) {
    //   if (set.contains(temp.next)) {
    //     return true;
    //   } else {
    //     set.add(temp.next);
    //   }

    //   temp=temp.next;
    // }
    // return false;


        /* T.C = O(n) and S.C = O(1) */
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
          fast = fast.next.next;
          slow = slow.next;

          if(slow == fast){
            return true;
          }
        }

        return false;

  }
}