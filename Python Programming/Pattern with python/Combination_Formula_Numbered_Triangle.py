n = int(input("Enter the length : "))

for i in range(0, n + 1):
    icj = 1
    for j in range(0, i + 1):
        print(f'{icj}  ', end=" ")
        icjp1 = icj * (i - j) // (j + 1)
        icj = icjp1
    print()