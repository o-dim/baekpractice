def solution(n):
    answer = 0
    if n % 2 == 1 :
        for i in range(0, int(n/2) + 1):
            answer += 2 * i + 1
    else :
        for i in range(0, int(n/2) + 1):
            answer += (2 * i) * (2 * i)
    return answer