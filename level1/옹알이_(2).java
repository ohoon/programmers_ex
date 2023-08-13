/*
코딩테스트 연습
옹알이
https://programmers.co.kr/learn/courses/30/lessons/133499
*/

class Solution {
    public boolean isNumeric(String str) {
        try {
            Long.parseLong(str);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    public int solution(String[] babbling) {
        int answer = 0;
        for (String babb : babbling) {
            String str = babb
                    .replaceAll("aya", "1")
                    .replaceAll("ye", "2")
                    .replaceAll("woo", "3")
                    .replaceAll("ma", "4");
            if (!isNumeric(str) ||
                    str.indexOf("11") > -1 ||
                    str.indexOf("22") > -1 ||
                    str.indexOf("33") > -1 ||
                    str.indexOf("44") > -1) {
                continue;
            }

            answer++;
        }

        return answer;
    }
}