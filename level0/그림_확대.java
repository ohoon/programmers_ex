/*
코딩 기초 트레이닝
그림 확대
https://school.programmers.co.kr/learn/courses/30/lessons/181836
*/

class Solution {
    public String[] solution(String[] picture, int k) {
        int n = picture.length;
        String[] answer = new String[n*k];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < picture[i].length(); j++) {
                for (int l = 0; l < k; l++) {
                    sb.append(picture[i].charAt(j));
                }
            }

            for (int l = 0; l < k; l++) {
                answer[i*k+l] = sb.toString();
            }

            sb.setLength(0);
        }

        return answer;
    }
}