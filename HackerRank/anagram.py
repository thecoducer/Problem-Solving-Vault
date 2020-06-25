# https://www.hackerrank.com/challenges/anagram/problem

def isAnagramPossible(s):
    s_len = len(s)
    s1 = s[:s_len//2]
    s2 = s[s_len//2:]

    s1_len = len(s1)
    s2_len = len(s2)

    if s1_len != s2_len:
        return "-1"

    count = [0] * 256
    
    for i in range(s1_len):
        count[ord(s1[i])] += 1
        count[ord(s2[i])] -= 1
    
    changes = 0
    for i in range(256):
        if count[i] > 0:
            changes += count[i]
    
    return changes

if __name__ == '__main__':
    n = int(input())
    
    for i in range(n):
        s = input().strip()
        print(isAnagramPossible(s))
