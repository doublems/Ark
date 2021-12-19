/**
 * 값만 교환 함
 * https://leetcode.com/submissions/detail/603905553/
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
let time = 1;

var swapPairs = function(head) {
    if(head?.next){
        time++;
        const a = swapPairs(head.next);
        if(time%2 === 0){
            const temp = a.val;
            a.val = head.val;
            head.val = temp;
        }
        time--;
    }

    return head;

};