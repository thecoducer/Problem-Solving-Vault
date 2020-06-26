# https://www.hackerrank.com/challenges/strong-password/problem

import re

def makePasswordStrong(n, password):
    changes = 0

    if not re.search('[0-9]', password):
        changes += 1

    if not re.search('[a-z]', password):
        changes += 1

    if not re.search('[A-Z]', password):
        changes += 1

    if not re.search(r'[!@#$%^&*()\-+]', password):
        changes += 1

    if (changes+n) < 6:
        changes += 6 - (changes+n)
    
    return changes


if __name__ == '__main__':
    n = int(input())
    password = input()
    print(makePasswordStrong(n, password))
