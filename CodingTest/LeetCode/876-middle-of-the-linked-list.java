

/**
 * 재귀를 사용한 방법
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
    private ListNode mid;

    public ListNode middleNode(ListNode head) {
        find(head, head);
        return mid;
    }

    public void find(ListNode slow, ListNode fast) {
        if(slow != null && fast != null){
            if(slow.next != null && fast.next != null){
                find(slow.next, fast.next.next);
            }else{
                mid = slow;
            }
        }else{
            mid = slow;
        }
    }

}

/**
 * 순회 1
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
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            if(fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }else{
                break;
            }
        }
        return slow;
    }
}

/**
 * 순회 리팩토링
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
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}