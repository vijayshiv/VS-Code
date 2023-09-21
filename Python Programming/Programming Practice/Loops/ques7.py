# fabonacci series
n = int(input("Enter the number -> "))
num = 0
a = 0
b = 1

for i in range(n):
    print(a, end=" ")
    num = a + b
    a = b
    b = num

