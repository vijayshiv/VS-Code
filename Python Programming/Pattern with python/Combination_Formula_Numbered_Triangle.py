n = int(input("Enter the length : "))

for i in range(1, n + 1):
    icj = 1
    for j in range(1, i + 1):
        print(icj, end=" ")
        icjp1 = (icj * (i - j)) // (j + 1)
        icj = icjp1
    print()