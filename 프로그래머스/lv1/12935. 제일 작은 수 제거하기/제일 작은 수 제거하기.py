def solution(arr):
    answer = []
    if len(arr) == 1 :
        answer.append(-1)
        return answer
    small = 10000
    for i in arr:
        answer.append(i)
        if small > i : 
            small = i
    answer.remove(small)
    return answer