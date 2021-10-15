/*
월간 코드 챌린지 시즌3
나머지가 1이 되는 수 찾기
https://programmers.co.kr/learn/courses/30/lessons/87389
*/

class Solution {
    public int solution(int n) {
        int m = n - 1;      // 나머지가 1이 되는 최대 값
        for (int i = 2; i < (int) Math.sqrt(m) + 1; i++) {      // m의 1이 아닌 약수 중에 가장 작은 값을 찾으면 반환
            if (m % i == 0) {
                return i;
            }
        }
        
        return m;           // m이 prime이면 m을 반환
    }
}
