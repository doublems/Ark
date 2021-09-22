/**
 * @param {string} s
 * @return {boolean}
 * @see https://leetcode.com/submissions/detail/554504413/
 * Runtime: 91 ms
 * Memory Usage: 39.9 MB
 * Date: 2021-09-16
 * Todo : Need to be better, faster
 */
var reorderLogFiles = function(logs) {
    const digitLogs = [];
    const letterLogs = [];

    logs.forEach((log) => {
        const splited = log.split(' ');
        const len = splited.length - 1;
        const result = splited.splice(1).filter((c) => !isNaN(Number.parseInt(c))).length;

        if (len === result) {
            digitLogs.push(log);
        } else {
            letterLogs.push(log);
        }
    })

    return letterLogs.sort((a, b) => {
        const aa = a.slice(a.indexOf(' ') + 1);
        const bb = b.slice(b.indexOf(' ') + 1);
        if (aa > bb) {
            return 1
        }

        if (aa < bb) {
            return -1
        }

        if(a < b){
            return -1
        }

        return 0
    }).concat(digitLogs);
}