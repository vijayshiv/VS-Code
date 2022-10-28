x = int(input("Enter the number here : "))
n = int(input("Enter the power here : "))

def powerOp(x,n):
    if(n == 0):
        return 1
    xn = 1
    if(n % 2 == 0):
        xn = powerOp(x, n//2) * powerOp(x, n//2)
    else:
        xn = powerOp(x, n//2) * powerOp(x, n//2) * x
    return xn

print(f' The answer is {powerOp(x,n)}')
