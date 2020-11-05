'''
2018 KAKAO BLIND RECRUITMENT
[3차] n진수 게임
https://programmers.co.kr/learn/courses/30/lessons/17687
'''

def toBaseN(n, number, dictionary):     # 해당 숫자를 n진법화 해서 돌려주는 함수
    if number // n == 0:
        return dictionary[number]
    
    return toBaseN(n, number // n, dictionary) + dictionary[number % n]

def solution(n, t, m, p):
    answer = ''
    hash_map = { 0: '0', 1: '1', 2: '2', 3: '3', 4: '4', 5: '5', 6: '6', 7: '7', 8: '8', 9: '9', 
        10: 'A', 11: 'B', 12: 'C', 13: 'D', 14:'E', 15: 'F' }
    turn = 2
    digit_num = 1       # 자리수 길이
    
    if p == 1:      # 첫 번째 차례면 0 추가
        answer += '0'
    
    while True:
        for num in range(n ** (digit_num - 1), n ** (digit_num)):       # 자리수가 1...x개인 숫자들 탐색
            for digit in range(digit_num):                          # 각 숫자의 자리수만큼 turn이 증가
                if ((turn - 1) % m) + 1 == p:                       # 자기 차례가 오면 해당 숫자를 n진법화해서 digit번째 문자열을 가져와 answer에 추가
                    answer += toBaseN(n, num, hash_map)[digit]
                    if len(answer) == t:                            # t개 성립 시 answer 반환하고 종료
                        return answer
                
                turn += 1
        digit_num += 1
            
    return answer

'''
여담

시간은 좀 많이 걸렸다. 1시간 반정도?
모든 숫자마다 n진수화하면 연산이 많을 것 같아서
자리수만 체크해서 turn에 더해주다가 자기 차례가 올 때만 10진수를 n진수로 변환해서 풀이하는 방법을 사용했다.

'''