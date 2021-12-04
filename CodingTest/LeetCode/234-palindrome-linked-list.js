/**
 * https://leetcode.com/submissions/detail/596846600/
 * Runtime: 216 ms
 * Memory Usage: 65.7 MB
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    let stack = [head.val];
    let next = head.next;
    let doubleNext = head.next;
    let isOdd = true;
    let isClean = false;
    while(next || stack.length > 0){
        if(doubleNext) {
            stack.push(next.val);
            isOdd = doubleNext?.next ? true : false;
            doubleNext = doubleNext?.next?.next;
        }else{
            if(!isClean && isOdd){
                stack.pop();
            } else if(!isClean) {
                if(stack.pop() !== stack.pop()){
                    return false;
                }
            }
            isClean = true;
            if(stack.pop() !== next?.val) {
                return false;
            }
        }
        next = next?.next;
    }
    return true;
};