/*
연습문제
연속된 부분 수열의 합
https://programmers.co.kr/learn/courses/30/lessons/178870
*/

class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = {0, Integer.MAX_VALUE};
        int sum = 0, L = 0, R = -1;
        do {
            sum += sequence[++R];
            while (sum > k) {
                sum -= sequence[L++];
            }

            if (sum == k) {
                if (answer[1] - answer[0] <= R - L) {
                    continue;
                }

                answer = new int[]{L, R};
            }
        } while (L <= R && R < sequence.length-1);

        return answer;
    }
}