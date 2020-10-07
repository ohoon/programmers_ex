'''
연습문제
직사각형 별찍기
https://programmers.co.kr/learn/courses/30/lessons/12969
'''

a, b = map(int, input().strip().split(' '))
print("\n".join(["*" * a] * b))     # *을 a번 반복한 문자열을 b개 가지는 배열을 생성해서 각 배열 원소를 \n으로 join