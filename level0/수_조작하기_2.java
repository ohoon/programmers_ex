/*
코딩 기초 트레이닝
수 조작하기 2
https://school.programmers.co.kr/learn/courses/30/lessons/181925
*/

class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i-1];
            switch (diff) {
                case 1:
                    sb.append("w");
                    break;
                case -1:
                    sb.append("s");
                    break;
                case 10:
                    sb.append("d");
                    break;
                case -10:
                    sb.append("a");
                    break;
            }
        }

        return sb.toString();
    }
}