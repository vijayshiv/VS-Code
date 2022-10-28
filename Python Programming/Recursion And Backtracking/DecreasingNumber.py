from re import T


n = int(input("Input the number here : "))

def decreaseNum(n):
    if(n == 0):
        return
    print(n, end="\n")
    return decreaseNum(n - 1)

decreaseNum(n)