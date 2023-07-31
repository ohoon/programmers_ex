/*
코딩테스트 연습
카드 뭉치
https://programmers.co.kr/learn/courses/30/lessons/159994
*/

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int len1 = cards1.length, len2 = cards2.length;
        int cur1 = 0, cur2 = 0;
        for (String str : goal) {
            if (cur1 < len1 && cards1[cur1].equals(str)) {
                cur1++;
                continue;
            }

            if (cur2 < len2 && cards2[cur2].equals(str)) {
                cur2++;
                continue;
            }

            return "No";
        }

        return "Yes";
    }
}