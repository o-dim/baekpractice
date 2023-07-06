def solution(s):
    if s.split()[0] == "-" :
        return -int(s)
    elif s.split()[0] == "+" :
        del s[0]
        return int(s)
    else :
        return int(s)