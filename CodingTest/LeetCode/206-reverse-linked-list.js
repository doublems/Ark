/**
 * https://leetcode.com/submissions/detail/600161190/
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function (head) {
    let [prev, cur] = [null, head];
    while(cur) {
        const temp = prev;
        prev = cur;
        cur = cur.next;
        prev.next = temp;
    }
    return prev;
};

/**
 * https://leetcode.com/submissions/detail/600158316/
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function (head) {
    let [prev, cur] = [null, head];
    while(cur) {
        [cur.next, prev, cur] = [prev, cur, cur.next]
    }
    return prev;
};