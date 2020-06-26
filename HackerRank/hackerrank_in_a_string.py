# https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem

def hackerrank_in_string(s):
    str = "hackerrank"
    
    j = 0
    for i in range(len(s)):
        if j < len(str) and str[j] == s[i]:
            j += 1
    
    if j < len(str):
        return "NO"
    else:
        return "YES"

if __name__ == '__main__':
    q = int(input())
    while q != 0:
        print(hackerrank_in_string(input()))
        q -= 1