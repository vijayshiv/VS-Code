n = int(input("Enter the length of Damru : "))
st = n
sp = 0

for i in range(1, n + 1):
    for j in range(1, sp + 1):
        print(" ", end=" ")
    for j in range(1, st + 1):
        if(i > 1 and i <= n // 2 and j > 1 and j < st):
            print(" ", end=" ")
        else:
            print("*", end=" ")
    if( i <= n // 2):
        sp = sp + 1
        st = st - 2
    else:
        sp = sp - 1
        st = st + 2
    print()