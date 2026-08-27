public class Solution {
  public ListNode detectCycle(ListNode head) {
    /*
    S.C = O(n)
    T.C = O(1)
    
     */
    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (slow == fast) {
        break;
      }
    }
    if (fast == null || fast.next == null)
      return null;
    while (head != slow) {
      head = head.next;
      slow = slow.next;
    }
    return head;
  }
}