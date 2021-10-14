/*
월간 코드 챌린지 시즌3
n^2 배열 자르기
https://programmers.co.kr/learn/courses/30/lessons/87390
*/

class Solution {
    public int[] solution(int n, long left, long right) {
        int size = (int) (right - left + 1);        // left와 right 사이의 폭
        int[] answer = new int[size];
        long N = (long) n;                          // long 타입으로 캐스팅
        for (int i = 0; i < answer.length; i++) {
            long cur = left + i;
            answer[i] = (int) Math.max(cur % N, cur / N) + 1;       // 1차원 배열 순서 기준의 인덱스인 cur을 2차원 좌표로 변환하면 [cur % N, cur / N]과 같음
        }
        
        return answer;
    }
}
