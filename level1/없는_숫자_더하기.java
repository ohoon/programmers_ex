/*
월간 코드 챌린지 시즌3
없는 숫자 더하기
https://programmers.co.kr/learn/courses/30/lessons/86051
*/

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {      // 0~9까지 합
            answer += i;
        }
        
        for (int n : numbers) {             // 0~9까지 합에서 numbers에 있는 수를 모두 뺀 값이 문제의 해답
            answer -= n;
        }
        
        return answer;
    }
}
