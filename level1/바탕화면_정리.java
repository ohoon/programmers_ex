/*
코딩테스트 연습
바탕화면 정리
https://programmers.co.kr/learn/courses/30/lessons/161990
*/

class Solution {
    public int[] solution(String[] wallpaper) {
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) != '#') {
                    continue;
                }

                minY = Math.min(minY, i);
                minX = Math.min(minX, j);
                maxY = Math.max(maxY, i);
                maxX = Math.max(maxX, j);
            }
        }

        return new int[]{minY, minX, maxY+1, maxX+1};
    }
}