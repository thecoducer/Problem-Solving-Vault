# https://www.hackerrank.com/challenges/find-digits/problem

def findDigits(n):
    divisors = 0
    num = n

    while n != 0:
        if n%10 != 0 and num % (n%10) == 0:
            divisors += 1
        n = n // 10
    
    return divisors


t = int(input())
while t > 0:
    print(findDigits(int(input())), end="\n")
    t -= 1
