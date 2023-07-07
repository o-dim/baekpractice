def solution(strArr):
    answer = []
    for i in range(0, len(strArr)) :
        if i % 2 == 0 :
            strArr[i] = strArr[i].lower()
        if i % 2 == 1 :
            strArr[i] = strArr[i].upper()
        answer.append(strArr[i])
    return answer