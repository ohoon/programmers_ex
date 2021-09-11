/*
위클리 챌린지 5주차
모음사전
https://programmers.co.kr/learn/courses/30/lessons/84512
*/

class Solution {
    private int count = 0;
    
    public int solution(String word) {
        return find(word, new char[]{'A', 'E', 'I', 'O', 'U'}, "");
    }
    
    private int find(String word, char[] alpha, String curr) {
        if (curr.equals(word)) {        // word에 해당하는 문자열이 완성되면 현재 count를 반환
            return count;
        }
        
        if (curr.length() >= 5) {       // curr의 길이가 5이상이 되도록 못찾으면 -1 반환
            return -1;
        }
        
        for (int i = 0; i < alpha.length; i++) {
            count++;
            int result = find(word, alpha, curr + alpha[i]);    // curr에서 알파벳 aeiou 하나씩 더한 값을 순회적으로 깊이 우선 탐색
            if (result > 0) {           // -1이 아닌 경우 word를 찾은 count 값이 반환됨
                return result;
            }
        }
        
        return -1;
    }
}
