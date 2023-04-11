/*
코딩테스트 입문
모스부호 (1)
https://school.programmers.co.kr/learn/courses/30/lessons/120838
*/

import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        Map<String, Character> map = new HashMap<>(){{
            put(".-",'a');
            put("-...",'b');
            put("-.-.",'c');
            put("-..",'d');
            put(".",'e');
            put("..-.",'f');
            put("--.",'g');
            put("....",'h');
            put("..",'i');
            put(".---",'j');
            put("-.-",'k');
            put(".-..",'l');
            put("--",'m');
            put("-.",'n');
            put("---",'o');
            put(".--.",'p');
            put("--.-",'q');
            put(".-.",'r');
            put("...",'s');
            put("-",'t');
            put("..-",'u');
            put("...-",'v');
            put(".--",'w');
            put("-..-",'x');
            put("-.--",'y');
            put("--..",'z');
        }};

        StringBuilder sb = new StringBuilder();
        for (String m : letter.split(" ")) {
            sb.append(map.get(m));
        }

        return sb.toString();
    }
}