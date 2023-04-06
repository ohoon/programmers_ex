/*
코딩테스트 입문
잘라서 배열로 저장하기
https://school.programmers.co.kr/learn/courses/30/lessons/120913
*/

class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()%n == 0 ? my_str.length()/n : my_str.length()/n+1];
        int len = answer.length;
        for (int i = 0; i < len; i++) {
            answer[i] = (i+1)*n < my_str.length() ? my_str.substring(i*n, (i+1)*n) : my_str.substring(i*n);
        }

        return answer;
    }
}