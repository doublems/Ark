import java.util.Optional;

/**
 * https://leetcode.com/problems/add-two-numbers/
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

    private ListNode result;
    private ListNode current;
    private int      addition = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = l1.val + l2.val + addition;

        if (sum / 10 > 0) {
            addition = 1;
            sum = sum % 10;
        }else{
            addition = 0;
        }

        if (result != null) {
            this.current.next = new ListNode(sum);
            this.current = current.next;
        } else {
            this.result = new ListNode(sum);
            this.current = result;
        }

        if (l1.next != null || l2.next != null) {
            this.addTwoNumbers(Optional.ofNullable(l1.next).orElseGet(() -> new ListNode(0)),
                    Optional.ofNullable(l2.next).orElseGet(() -> new ListNode(0)));
        }

        if(addition>0){
            this.current.next = new ListNode(1);
        }

        return result;
    }
}