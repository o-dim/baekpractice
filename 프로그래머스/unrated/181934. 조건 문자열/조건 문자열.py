def solution(ineq, eq, n, m):
    if eq == "!" :
        eq = ""
    answer = str(n) + ineq + eq + str(m)
    if eval(answer):
        return 1
    else:
        return 0