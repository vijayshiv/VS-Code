# reversing a number

n = int(input("Enter the number -> "))

num = 0
while (n > 0):
    r = n % 10
    num = (num * 10) + r
    n = n // 10
print(f'Reverse number -> {num}')