/**
 * https://leetcode.com/submissions/detail/619675832/
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
    private ListNode before;
    public ListNode removeElements(ListNode head, int val) {
        if(head!=null){
            before = head;
            remove(head, val);
            if(head.val == val){
                return head.next;
            }
        }
        return head;
    }

    public void remove(ListNode head, int val){
        if(head!=null){
            if(head.val == val){
                before.next = head.next;
            }else{
                before = head;
            }
            remove(head.next, val);
        }
    }
}