from traceback import print_tb


n = int(input("Enter the length of triangle : "))

for i in range(1, n + 1):
    for j in range(1, i + 1):
        print("* ", end=" ")
    print()