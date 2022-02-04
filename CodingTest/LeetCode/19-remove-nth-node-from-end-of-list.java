/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    private ListNode before;
    private int      index = 1;

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head != null) {
            removeNthFromEnd(head.next, n);
            if (index++ == n) {
                before = head;
            } else if (before != null) {
                head.next = before.next;
                before = null;
            }
        }
        // [1], 1 혹은 , [1,2]-2 인 경우 처리를 해줘야 한다.
        if (before != null) {
            head = before.next;
        }

        return head;
    }

}