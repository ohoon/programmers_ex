'''
2018 KAKAO BLIND RECRUITMENT
[1차] 비밀지도
https://programmers.co.kr/learn/courses/30/lessons/17681
'''

def solution(n, arr1, arr2):
    answer = []
    
    for i in range(n):
        line = str( int( str( bin(arr1[i]) )[2:] ) + int( str( bin(arr2[i]) )[2:] ) )   # arr1, arr2의 요소를 2진수로 바꾸고 2진수 자체를 10진수처럼 더해서 string 형태로 저장
        line = "0" * (n - len(line)) + line     # n개의 자리수를 0으로 채우기
        line = line.replace('0', ' ').replace('1', '#').replace('2', '#')   # 0은 공백, 나머지는 #
        answer.append(line)
        
    return answer

'''
다른 사람의 풀이

def solution(n, arr1, arr2):
    answer = []
    for i,j in zip(arr1,arr2):
        a12 = str(bin(i|j)[2:])
        a12=a12.rjust(n,'0')
        a12=a12.replace('1','#')
        a12=a12.replace('0',' ')
        answer.append(a12)
    return answer

bin으로 2진수화했으면 비트연산을 했어야했는데
string으로 슬라이싱해서 더해버려서 코드가 복잡해지는 실수를 해버렸다..
거기다 나머지 자리를 0으로 채우는걸 n - len(line)으로 나머지 갯수 알아내서 붙여줬는데
rjust를 쓰면 손쉽게 같은 작업을 할 수 있단걸 알았다.
비트연산과 rjust, 꼭 머리에 넣고 다음에 써먹어봐야지
'''