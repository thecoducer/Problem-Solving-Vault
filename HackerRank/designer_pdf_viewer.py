# https://www.hackerrank.com/challenges/designer-pdf-viewer/problem

import sys

def designerPdfViewer(heights, word):
    max_height = -sys.maxsize
    
    for i in range(len(word)):
        h = int(heights[ord(word[i])-97])
        if h > max_height:
            max_height = h
    
    return len(word) * max_height

if __name__ == '__main__':
    heights = input().split(" ")
    print(designerPdfViewer(heights, input()))