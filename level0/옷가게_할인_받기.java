/*
코딩테스트 입문
옷가게 할인 받기
https://school.programmers.co.kr/learn/courses/30/lessons/120818
*/

class Solution {
    public int solution(int price) {
        return price >= 500000 ? price*4/5 : price >= 300000 ? price*9/10 : price >= 100000 ? price*19/20 : price;
    }
}