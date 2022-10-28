n = int(input("input the number : "))

def incerseNum(n):
    if(n == 0):
        return
    incerseNum(n - 1)
    print(n, end="\n")

incerseNum(n)