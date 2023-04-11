/*
코딩테스트 입문
가위 바위 보
https://school.programmers.co.kr/learn/courses/30/lessons/120839
*/

class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (char ch : rsp.toCharArray()) {
            switch (ch) {
                case '0':
                    sb.append('5');
                    break;
                case '2':
                    sb.append('0');
                    break;
                case '5':
                    sb.append('2');
                    break;
                default:
                    break;
            }
        }

        return sb.toString();
    }
}