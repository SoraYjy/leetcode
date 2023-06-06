package list;

import list.model.ListNode;

/**
 * @author yujingyi
 * @date 2023/6/2
 */
public class FindMiddleNode {
  public ListNode middleNode(ListNode head) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode slow = dummy, fast = dummy;

    while (fast.next != null) {
      fast = fast.next;
      if (fast.next != null) {
        fast = fast.next;
        slow = slow.next;
      }
    }

    return slow.next;
  }

}
