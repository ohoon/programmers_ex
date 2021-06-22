/*
2017 카카오코드 본선
단체사진 찍기
https://programmers.co.kr/learn/courses/30/lessons/1835
*/

class Solution {
    static int answer = 0;
    static String names = "ACFJMNRT";       // indexOf용
    static int[] status = new int[8];       // 캐릭터별 위치
    static boolean[] slot = new boolean[8]; // 빈 자리 판별용
    
    public int solution(int n, String[] data) {
        answer = 0;
        permutation(data, 1);       // 첫 번째 자리부터 캐릭터 선정 시작
        return answer;
    }
    
    public void permutation(String[] data, int pos) {
        if (pos > 8) {
            if (check(data, status)) {      // 모든 캐릭터가 자리에 위치하면 해당 순열이 조건에 부합하는지 검사
                answer++;
            }
            
            return;
        }
        
        for (int i = 0; i < 8; i++) {       // 각 자리를 검사하여 빈 자리라면 캐릭터를 할당
            if (!slot[i]) {
                status[i] = pos;
                slot[i] = true;
                permutation(data, pos + 1);     // 순회하여 다음 캐릭터가 차지할 자리 결정 (순열 구하기)
                slot[i] = false;
            }
        }
    }
    
    public boolean check(String[] data, int[] status) {     // 해당 배치가 조건에 부합하는지 검사
        for (String condition : data) {
            int p1 = names.indexOf(condition.charAt(0));
            int p2 = names.indexOf(condition.charAt(2));
            char op = condition.charAt(3);
            int dist = condition.charAt(4) - '0';
            switch (op) {
                case '=':
                    if (Math.abs(status[p1] - status[p2]) - 1 != dist) {
                        return false;
                    }
                    
                    break;
                case '>':
                    if (Math.abs(status[p1] - status[p2]) - 1 <= dist) {
                        return false;
                    }
                    
                    break;
                case '<':
                    if (Math.abs(status[p1] - status[p2]) - 1 >= dist) {
                        return false;
                    }
                    
                    break;
            }
        }
        
        return true;
    }
}

/*
여담

힌트를 조금 참고하면서 어찌저찌 풀이해냈다.
하지만 푸는데 시간을 조금 많이 소모해서 아쉬운 부분이 많다.

*/
