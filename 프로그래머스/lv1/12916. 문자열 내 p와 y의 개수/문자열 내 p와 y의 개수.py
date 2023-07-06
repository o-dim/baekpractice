def solution(s):
    answer = True
    Pcount = 0
    Ycount = 0
    for i in s:
        if i.lower() == "p" :
            Pcount += 1
        elif i.lower() == "y" :
            Ycount += 1
    return Pcount == Ycount
