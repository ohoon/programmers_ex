/*
코딩 기초 트레이닝
수 조작하기 1
https://school.programmers.co.kr/learn/courses/30/lessons/181926
*/

class Solution {
    public int solution(int n, String control) {
        for (char command : control.toCharArray()) {
            switch (command) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }

        return n;
    }
}