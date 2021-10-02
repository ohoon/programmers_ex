/*
위클리 챌린지 7주차
입실 퇴실
https://programmers.co.kr/learn/courses/30/lessons/86048
*/

import java.util.*;

class Solution {
    public int[] solution(int[] enter, int[] leave) {
        int[] answer = new int[enter.length];
        List<Integer> room = new ArrayList<>();     // 현재 회의실에 있는 사람들
        int cur = 0;
        for (int i = 0; i < leave.length; i++) {
            if (room.indexOf(leave[i]) > -1) {      // 지금 떠나야 하는 사람이 room에 있으면 room에서 해당 사람을 나가게 하고 만남 횟수 계산
                room.remove(room.indexOf(leave[i]));
                calc(room, leave[i], answer);
                continue;
            }
            
            while (enter[cur] != leave[i]) {        // 지금 떠나야 하는 사람이 room에 없으면 해당 사람이 room에 입실할 때까지 room에 다른 사람들을 입실시킴
                room.add(enter[cur++]);
            }
            
            calc(room, leave[i], answer);           // 해당 사람이 room에 입실하면 현재 room 상황으로 만남 횟수 계산
            cur++;
        }
        
        return answer;
    }
    
    private void calc(List<Integer> room, int index, int[] answer) {        // room 상황과 현재 떠나는 사람 번호를 통해 만남 횟수를 계산하는 함수
        for (int i = 0; i < room.size(); i++) {
            answer[room.get(i)-1]++;                // room에 있는 모든 사람들의 만남 횟수 + 1
            answer[index-1]++;                      // 떠나는 사람은 현재 room에 있는 사람들 수만큼 만남을 가짐
        }
    }
}
