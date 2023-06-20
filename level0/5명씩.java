/*
코딩 기초 트레이닝
5명씩
https://school.programmers.co.kr/learn/courses/30/lessons/181886
*/

class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length-1)/5+1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[i*5];
        }

        return answer;
    }
}