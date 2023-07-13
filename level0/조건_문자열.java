/*
코딩 기초 트레이닝
조건 문자열
https://school.programmers.co.kr/learn/courses/30/lessons/181934
*/

class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        switch (ineq + eq) {
            case ">=":
                return n >= m ? 1 : 0;
            case "<=":
                return n <= m ? 1 : 0;
            case ">!":
                return n > m ? 1 : 0;
            case "<!":
                return n < m ? 1 : 0;
        }

        return 0;
    }
}