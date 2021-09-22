/**
 * https://leetcode.com/submissions/detail/559007056/
 * Runtime: 80 ms
 * Memory Usage: 40.1 MB
 * Date: 2021-09-22
 * Todo : Need to be better, faster
 */
var mostCommonWord = function(paragraph, banned) {
    const result = new Map();
    const resultObject ={key:'', value:0};

    paragraph.split(/\W/)
        .map((s) => s.toLowerCase())
        .filter((rs) => rs !== '')
        .filter((rs) => !banned.includes(rs))
        .forEach((rs) => {
            const current = result.get(rs) ?? 0;
            result.set(rs, current + 1);

            if(resultObject.value <= current + 1){
                resultObject.key = rs;
                resultObject.value = current + 1;
            }
        });

    return resultObject.key;
};