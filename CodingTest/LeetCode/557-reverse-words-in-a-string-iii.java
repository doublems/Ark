// String builder 를 이용한 풀이법
public class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");

        StringBuilder res=new StringBuilder();

        for (String word: words){
            res.append(new StringBuilder(word).reverse().toString() + " ");
        }

        return res.toString().trim();
    }
}


// stack을 이용한 풀이법
class Solution {
    public String reverseWords(String s) {
        char [] splited = s.toCharArray();
        Stack<Character> sc = new Stack<>();
        int index = 0;

        for(char word : splited){
            if(word == ' '){
                while(!sc.isEmpty()){
                    splited[index++] = sc.pop();
                }
                splited[index++] = ' ';
            }else{
                sc.push(word);
            }
        }

        while(!sc.isEmpty()){
            splited[index++] = sc.pop();
        }

        return new String(splited);
    }
}