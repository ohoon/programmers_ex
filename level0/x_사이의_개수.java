/*
코딩 기초 트레이닝
x 사이의 개수
https://school.programmers.co.kr/learn/courses/30/lessons/181867
*/

class Solution {
    public int[] solution(String myString) {
        String[] split = myString.split("x");
        int[] answer = new int[myString.charAt(myString.length()-1) == 'x' ? split.length+1 : split.length];
        for (int i = 0; i < split.length; i++) {
            answer[i] = split[i].length();
        }

        return answer;
    }
}