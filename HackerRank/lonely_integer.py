# https://www.hackerrank.com/challenges/lonely-integer/problem

if __name__ == '__main__':
    n = int(input().strip())
    y = 0
    x = input().split(" ")
    
    for i in range(n):
        y = int(x[i]) ^ y

    print(y)