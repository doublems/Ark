/**
 * easy way
 * https://leetcode.com/submissions/detail/622519886/
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
        ListNode target = head;

        while(target != null){
            if(target.val >=100000){
                return true;
            }
            target.val += 100000;
            target = target.next;
        }

        return false;
    }
}


/**
 * two pointer
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
        ListNode slower = head;
        ListNode faster = head;
        while(faster != null && faster.next != null){
            slower = slower.next;
            faster = faster.next.next;
            if(slower == faster) {
                return true;
            }
        }

        return false;
    }
}