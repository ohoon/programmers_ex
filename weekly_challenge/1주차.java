/*
위클리 챌린지 1주차
부족한 금액 계산하기
https://programmers.co.kr/learn/courses/30/lessons/82612
*/

class Solution {
    public long solution(int price, int money, int count) {
        long totalCount = (count * (count + 1)) / 2;      // 1부터 count까지의 합
        long total = totalCount * price;                  // 최종 pay값
        return Math.max(total - money, 0L);
    }
}

/*
여담

long 타입을 사용해도 되기 때문에 사실상 쉬운 문제나 다름없다.
예상하지 못한 점은 totalCount와 total로 분리하지 않고 long total = (count * (count + 1)) / 2... * price; 처럼
인라인으로 작성하면 total을 long으로 타입을 정해도 오버플로우가 나타나는 현상이 있었다.

*/
