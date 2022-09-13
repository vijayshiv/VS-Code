n = int(input("Enter the length of triangle : "))
sp = 0
st = n

for i in range(1, n + 1):
    for j in range(1, sp+1):
        print("  ",end=" ")
    for j in range(1, st + 1):
        print("* ", end=" ")
    sp = sp + 1
    st = st - 1

    print()
