/**
 * not sorted cases
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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> sets = new HashSet<>();
        ListNode pre = null;
        ListNode curr = head;
        while(curr != null) {
            if(sets.contains(curr.val)){
                if(curr.next == null) {
                    pre.next = null;
                }
            }else{
                sets.add(curr.val);
                if(pre != null){
                    pre.next = curr;
                }
                pre = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}

/**
 * for sorted list
 * https://leetcode.com/submissions/detail/623247260/
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            if(curr.next == null){
                break;
            }

            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}