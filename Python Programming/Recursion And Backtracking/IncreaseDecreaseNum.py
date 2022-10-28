n = int(input("Input the number : "))

def printIncDec(n):
    if(n == 0):
        return
    print(n, end="\n")
    printIncDec(n - 1)
    print(n, end="\n")

printIncDec(n)