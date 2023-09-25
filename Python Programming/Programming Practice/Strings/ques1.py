# https://pynative.com/python-string-exercise/#h-exercise-1a-create-a-string-made-of-the-first-middle-and-last-character

def fmlString(str):
    first = str[0]
    mid = str[len(str)//2]
    last = str[len(str) - 1]

    return first+mid+last

str = "vijay"
ans = fmlString(str)
print(ans)