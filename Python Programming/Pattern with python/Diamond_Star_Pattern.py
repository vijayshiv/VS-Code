n = int(input("Enter the length of triangle : "))
sp = n // 2
st = 1

for i in range(1, n + 1):
    for j in range(1, sp+1):
        print("  ",end=" ")
    for j in range(1, st + 1):
        print("* ", end=" ")
    if(i <= n // 2):
        sp = sp - 1
        st = st + 2
    else:
        sp = sp + 1
        st = st - 2
    print()
