'''
정렬
가장 큰 수
https://programmers.co.kr/learn/courses/30/lessons/42746
'''

def solution(numbers):
    numbers = map(str, numbers)     # 각 숫자 문자열로 변환
    answer = "".join(sorted(numbers, key=lambda x: x * 3, reverse=True))    # 각 문자열을 3배씩 늘려서 비교 후, 큰 것부터 내림차순 정렬
                                                                            # ex) '31' -> '313131', '313' -> '313313313'
                                                                            # 사전 순으로 '313313313' 다음에 '313131' 이므로
                                                                            # '313' + '31' => '31331'
    
    return answer if answer[0] != '0' else '0'  # '0..0' -> '0'

'''
다른 사람의 풀이

import functools

def comparator(a,b):
    t1 = a+b
    t2 = b+a
    return (int(t1) > int(t2)) - (int(t1) < int(t2)) #  t1이 크다면 1  // t2가 크다면 -1  //  같으면 0

def solution(numbers):
    n = [str(x) for x in numbers]
    n = sorted(n, key=functools.cmp_to_key(comparator),reverse=True)
    answer = str(int(''.join(n)))
    return answer

내 풀이 코드는 일종의 꼼수를 쓴 코드지만
위의 풀이는 sort 함수의 key를 적절하게 쓴 것이라고 볼 수 있다.
'''
