/*
위클리 챌린지 10주차
교점에 별 만들기
https://programmers.co.kr/learn/courses/30/lessons/87377
*/

import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(int[][] line) {
        List<int[]> list = new ArrayList<>();
        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;     // x축 기준 최소, 최대값
        int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;     // y축 기준 최소, 최대값
        for (int i = 0; i < line.length-1; i++) {
            long A = line[i][0], B = line[i][1], E = line[i][2];    // line의 각 좌표값을 long으로 치환하여 overflow 예방
            for (int j = i+1; j < line.length; j++) {
                long C = line[j][0], D = line[j][1], F = line[j][2];
                long deno = A*D - B*C;                              // 교점의 x, y값을 계산하는 데 필요한 공통 분모 값
                if (deno == 0) {                                    // deno == 0이라면 두 직선은 평행하거나 같은 직선이여서 교점이 발생하지 않거나 무수히 많은 교점이 발생할 것임
                    continue;
                }
                
                if ((B*F - E*D) % deno != 0) {                      // x = (B*F - E*D) / deno 식으로 구할 수 있음. x의 값이 정수가 되기 위해서는 deno로 나누어 떨어져야 함
                    continue;
                }
                long x = (B*F - E*D) / deno;
                
                if ((E*C - A*F) % deno != 0) {                      // x값을 구할 때와 동일
                    continue;
                }
                long y = (E*C - A*F) / deno;
                
                int[] cross = {(int) x, (int) y};
                minX = Math.min(minX, cross[0]);                    // 각 교점 x, y값의 최소/최대값 갱신
                minY = Math.min(minY, cross[1]);
                maxX = Math.max(maxX, cross[0]);
                maxY = Math.max(maxY, cross[1]);
                list.add(cross);
            }
        }
        
        list = list.stream()                                        // 사방면 기준 왼쪽 위부터 배열이 시작되기 때문에 y값은 내림차순, x값은 오름차순으로 교점 순서를 정렬
            .sorted((a, b) -> a[1] == b[1] ? a[0] - b[0] : b[1] - a[1])
            .collect(Collectors.toList());
        
        int width = maxX - minX + 1;
        int height = maxY - minY + 1;
        String[] answer = new String[height];
        StringBuilder sb = new StringBuilder();
        int cur = 0;
        for (int i = maxY; i >= minY; i--) {                                                    // 사방면 왼쪽 위부터 탐색을 시작
            for (int j = minX; j <= maxX; j++) {
                if (cur >= list.size() || i != list.get(cur)[1] || j != list.get(cur)[0]) {     // 현재 좌표가 교점 좌표와 동일하지 않으면 .으로 builder에 삽입
                    sb.append('.');
                    continue;
                }
                
                sb.append('*');                                                                 // 현재 좌표가 교점 좌표와 동일하면 *으로 builder에 삽입
                while (cur < list.size() && i == list.get(cur)[1] && j == list.get(cur)[0]) {   // list 내의 중복된 교점 처리
                    cur++;
                }
            }
            
            answer[maxY-i] = sb.toString();
            sb.setLength(0);
        }
        
        return answer;
    }
}

/*
여담

처음에 두 직선의 교점 좌표를 구하는 공식을 이용하지 않고 방정식으로 풀이하려다가 시간을 많이 썼다.
예제의 테스트 케이스는 통과가 됐지만 제출할 때 거의 대부분의 테스트 케이스에서 실패하였음..
나름 중복된 계산을 줄이기 위해서 각 직선의 데이터를 y = Ax + B 식으로 치환해놓고 방정식에 쓰게끔 했는데, 그 과정에서 알 수 없는 예외들이 발생했나보다.
정상적으로 공식을 이용하도록 바꿔주니 하나의 테스트 케이스를 제외하고 모두 통과가 되었다. (속도도 그렇게 느리지 않더라..)
이 하나의 테스트 케이스는 왜 통과가 안됐을까 생각을 해보다가 문제에서 주어지는 A, B, ... 값들의 범위가 생각보다 큰 것을 보고 오버플로우가 났지 않았을까 예감이 들었다.
다행히도 long으로 치환해서 풀이하니 모든 테스트 케이스를 통과하게 되었다.

*/
