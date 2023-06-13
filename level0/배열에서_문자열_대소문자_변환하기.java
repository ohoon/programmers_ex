/*
코딩 기초 트레이닝
배열에서 문자열 대소문자 변환하기
https://school.programmers.co.kr/learn/courses/30/lessons/181875
*/

class Solution {
    public String[] solution(String[] strArr) {
        for (int i = 0; i < strArr.length; i += 2) {
            strArr[i] = strArr[i].toLowerCase();
        }

        for (int i = 1; i < strArr.length; i += 2) {
            strArr[i] = strArr[i].toUpperCase();
        }

        return strArr;
    }
}