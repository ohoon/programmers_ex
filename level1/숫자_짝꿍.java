/*
코딩테스트 연습
숫자 짝꿍
https://programmers.co.kr/learn/courses/30/lessons/131128
*/

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] freqX = new int[10];
        int[] freqY = new int[10];
        for (int i = 0; i < X.length(); i++) {
            freqX[X.charAt(i)-'0']++;
        }

        for (int i = 0; i < Y.length(); i++) {
            freqY[Y.charAt(i)-'0']++;
        }

        for (int i = freqX.length-1; i > 0; i--) {
            for (int j = 0; j < Math.min(freqX[i], freqY[i]); j++) {
                sb.append("" + i);
            }
        }

        if (sb.length() == 0) {
            return freqX[0] > 0 && freqY[0] > 0 ? "0" : "-1";
        }

        for (int i = 0; i < Math.min(freqX[0], freqY[0]); i++) {
            sb.append("0");
        }

        return sb.toString();
    }
}