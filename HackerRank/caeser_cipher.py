# https://www.hackerrank.com/challenges/caesar-cipher-1/problem

import math
import os
import random
import re
import sys

def caesarCipher(s, k):
    encrypted_string = ""
    
    k %= 26

    for alphabet in s:
        rotated_alphabet = chr(ord(alphabet) + k)

        if alphabet.islower():
            if rotated_alphabet > "z":
                rotated_alphabet = chr(ord(rotated_alphabet) - 26)

            encrypted_string += rotated_alphabet

        elif alphabet.isupper():
            if rotated_alphabet > "Z":
                rotated_alphabet = chr(ord(rotated_alphabet) - 26) 

            encrypted_string += rotated_alphabet
            
        else:
            encrypted_string += alphabet

    return encrypted_string

    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    n = int(input())
    s = input()
    k = int(input())
    result = caesarCipher(s, k)
    fptr.write(result + '\n')
    fptr.close()