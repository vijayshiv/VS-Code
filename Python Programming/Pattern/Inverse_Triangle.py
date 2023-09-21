n = int(input("Enter the length of triangle : "))

for i in range(n , 0, -1 ):
    for j in range(1, i + 1):
        print("* ", end=" ")
    print()