/*
코딩테스트 입문
숨어있는 숫자의 덧셈 (2)
https://school.programmers.co.kr/learn/courses/30/lessons/120864
*/

class Solution {
    boolean isDigit(char str) {
        return str >= '0' && str <= '9';
    }

    public int solution(String my_string) {
        int answer = 0, n = my_string.length();
        int L = 0, R = 0;
        while (L < n) {
            if (!isDigit(my_string.charAt(L))) {
                L++;
                continue;
            }

            R = L;
            while (R < n && isDigit(my_string.charAt(R))) {
                R++;
            }

            answer += Integer.valueOf(my_string.substring(L, R));
            L = R;
        }

        return answer;
    }
}